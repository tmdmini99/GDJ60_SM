package com.iu.s2.qna;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTest;

public class QnaTest extends MyTest{
	
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public void test() throws Exception{
		QnaDTO dto = new QnaDTO();
		//List<QnaDTO> ar = qnaDAO.getQnaList();
		//assertEquals(1, ar);
	}
	
}
