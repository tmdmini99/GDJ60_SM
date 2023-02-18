package com.iu.s2.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileManager {
	
	
	public String fileSave(MultipartFile multipartFile, String path) throws Exception{
		
		File file = new File(path);
		if(!file.exists()) {
			//file.mkdir();//중간 폴더가 없으면 에러
			file.mkdirs();//중간 폴더가 없으면 중간 폴더도 생성
		}
		String name=UUID.randomUUID().toString();
		name=name+"_"+multipartFile.getOriginalFilename();
		
		file = new File(file, name);
		
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		return name;
		
		
	}
}
