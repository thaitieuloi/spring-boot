package com.ttl.spring.files.upload.db;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

//@SpringBootTest
class SpringBootUploadFilesDatabaseApplicationTests {

	@Test
	void contextLoads() {
		
		final HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.MULTIPART_FORM_DATA);

	    MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
	    parameters.set("Content-Type","multipart/form-data");
	    FileSystemResource file = new FileSystemResource(new File("D:\\java\\actual\\03.png"));
	    parameters.add("file", file);
		
		    
		HttpEntity<MultiValueMap<String, Object>> requestEntity
		  = new HttpEntity<>(parameters, headers);

		String serverUrl = "http://localhost:8080/files";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate
		  .postForEntity(serverUrl, requestEntity, String.class);
		
		System.out.println(response.getStatusCode());
	}

}
