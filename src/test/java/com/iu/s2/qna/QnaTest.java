package com.iu.s2.qna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTest;

public class QnaTest extends MyTest{
	
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void test() throws Exception{
		QnaDTO dto = new QnaDTO();
		dto.setNum(1L);
		dto = qnaDAO.getQnaDetail(dto);
		assertNotNull(dto);
	}
	
}
