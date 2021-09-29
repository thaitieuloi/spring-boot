package com.ttl.spring.files.upload.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseFile {
	private String id;
	private String name;
	private String url;
	private String contentType;
	private long size;
}
