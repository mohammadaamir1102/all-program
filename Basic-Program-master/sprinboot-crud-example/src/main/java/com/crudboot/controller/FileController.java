package com.crudboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

	@PostMapping("/file-upload")
	public ResponseEntity<String> fileUpload(@RequestParam("file")MultipartFile file) {
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		return ResponseEntity.ok("uploaded file");
	}

}
