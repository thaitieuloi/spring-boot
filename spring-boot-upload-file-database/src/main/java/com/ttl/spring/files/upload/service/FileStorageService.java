package com.ttl.spring.files.upload.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.ttl.spring.files.upload.entity.FileEntity;
import com.ttl.spring.files.upload.repository.FileRepository;

@Service
public class FileStorageService {

	@Autowired
	private FileRepository fileRepository;

	/**
	 * Store file to database
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public FileEntity store(MultipartFile file) throws IOException {
		FileEntity fileEntity = new FileEntity();
		fileEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
		fileEntity.setContentType(file.getContentType());
		fileEntity.setData(file.getBytes());
		fileEntity.setSize(file.getSize());

		return fileRepository.save(fileEntity);
	}

	/**
	 * write File
	 * 
	 * @param file
	 * @throws IOException
	 */
	public void writeFile(MultipartFile file) throws IOException {
		String currentDir = System.getProperty("user.dir");
//		 System.out.println("Current dir using System:" + currentDir);
		File fileCurrentRelative = Paths.get(currentDir, "files", file.getOriginalFilename()).toFile();
		if (!fileCurrentRelative.getParentFile().exists()) {
			fileCurrentRelative.getParentFile().mkdirs();
		}
		Files.write(fileCurrentRelative.toPath(), file.getBytes());
	}

	/**
	 * get File from database
	 * 
	 * @param id
	 * @return
	 */
	public FileEntity getFile(String id) {
		Optional<FileEntity> fileEntityOptional = fileRepository.findById(id);

		if (!fileEntityOptional.isPresent()) {
			return null;
		}

		return fileEntityOptional.get();
	}

	/**
	 * get All Files from database
	 * 
	 * @return
	 */
	public List<FileEntity> getAllFiles() {
		return fileRepository.findAll();
	}
}
