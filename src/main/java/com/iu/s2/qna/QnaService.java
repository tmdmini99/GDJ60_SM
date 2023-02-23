package com.iu.s2.qna;

import java.util.List;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s2.util.FileUp;
import com.iu.s2.util.Pagers;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	
	
	@Autowired
	private ServletContext servletContext;
	
	public List<QnaDTO> getQnaList(Pagers pagers) throws Exception{
		Long total= qnaDAO.getQnaCount(pagers);
		pagers.makeNum(total);
		pagers.makeRow();
		
		return qnaDAO.getQnaList(pagers);
	}
	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception{
		
		return qnaDAO.getQnaDetail(qnaDTO);
	}
	public int setQnaAdd(QnaDTO qnaDTO,MultipartFile pic) throws Exception{
		String realPath=servletContext.getRealPath("resources/qna/img");
		
		FileUp fileUp = new FileUp();
		int a =qnaDAO.setQnaAdd(qnaDTO);
		String name =fileUp.fileUpload(realPath, pic);
		QnaImgDTO qnaImgDTO = new QnaImgDTO();
		System.out.println(name);
		qnaImgDTO.setFileName(name);
		qnaImgDTO.setOriName(pic.getOriginalFilename());
		qnaImgDTO.setNum(qnaDTO.getNum());
		
		a = qnaDAO.setQnaImgAdd(qnaImgDTO);
		return a;
	}
}
