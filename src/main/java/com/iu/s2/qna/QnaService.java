package com.iu.s2.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s2.util.Pagers;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<QnaDTO> getQnaList(Pagers pagers) throws Exception{
		Long total= qnaDAO.getQnaCount(pagers);
		pagers.makeNum(total);
		pagers.makeRow();
		
		return qnaDAO.getQnaList(pagers);
	}
}
