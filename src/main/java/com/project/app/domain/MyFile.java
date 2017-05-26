package com.project.app.domain;

import org.springframework.web.multipart.MultipartFile;

public class MyFile {
	private MultipartFile data;
	private String s = "sss";

	public MyFile() {
		
	}
	
	public MultipartFile getData() {
		return data;
	}

	public void setData(MultipartFile data) {
		this.data = data;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
		
	
}
