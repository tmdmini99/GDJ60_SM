package com.iu.s2.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUp{

	public String fileUpload(String path,MultipartFile pic) throws Exception{
		File file = new File(path);
		
		if(!file.exists()) {
			//file.mkdir();//중간 폴더가 없으면 에러
			file.mkdirs();//중간 폴더가 없으면 중간 폴더도 생성
		}
		
		String name=pic.getOriginalFilename();
		name=UUID.randomUUID().toString()+"_"+name;
		file = new File(file, name);
		
		FileCopyUtils.copy(pic.getBytes(), file);
		return name;
	}
}
