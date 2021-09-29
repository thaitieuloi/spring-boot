package com.ttl.spring.files.upload.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ttl.spring.files.upload.entity.FileEntity;
import com.ttl.spring.files.upload.model.ResponseFile;
import com.ttl.spring.files.upload.model.ResponseMessage;
import com.ttl.spring.files.upload.service.FileStorageService;

@RestController
@RequestMapping("files")
public class FileController {

	@Autowired
	private FileStorageService storageService;

	// API POST: files/upload
	@PostMapping("")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";
		try {
			storageService.store(file);
			storageService.writeFile(file);

			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		} catch (Exception e) {
			message = "Could not upload the file: " + file.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}

	// API GET all: files
	@GetMapping("")
	public ResponseEntity<List<ResponseFile>> getListFiles() {
		List<ResponseFile> files = storageService.getAllFiles().stream().map(this::mapToFileResponse)
				.collect(Collectors.toList());

		return ResponseEntity.status(HttpStatus.OK).body(files);
	}

	/**
	 * map To File Response
	 * 
	 * @param fileEntity
	 * @return
	 */
	private ResponseFile mapToFileResponse(FileEntity fileEntity) {
		String downloadURL = ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/")
				.path(fileEntity.getId()).toUriString();
		ResponseFile responseFile = new ResponseFile();
		responseFile.setId(fileEntity.getId());
		responseFile.setName(fileEntity.getName());
		responseFile.setContentType(fileEntity.getContentType());
		responseFile.setSize(fileEntity.getSize());
		responseFile.setUrl(downloadURL);

		return responseFile;
	}

	// API GET with id: files/{id}
	@GetMapping("/{id}")
	public ResponseEntity<byte[]> getFile(@PathVariable String id) {
		FileEntity fileDB = storageService.getFile(id);

		if (fileDB == null) {
			// set response not found
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
				.contentType(MediaType.valueOf(fileDB.getContentType())).body(fileDB.getData());
	}
}
