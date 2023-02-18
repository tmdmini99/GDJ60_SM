package com.iu.s2.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTest;

public class NoticeDAOTest extends MyTest{

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void setNoticeImgAdd() throws Exception{
		NoticeImgDTO noticeDTO = new NoticeImgDTO();
		noticeDTO.setFileName("DD");
		noticeDTO.setNoticeNum(1L);
		noticeDTO.setOriName("안녕하세요하세요");
		int re=noticeDAO.setNoticeFileAdd(noticeDTO);
		
		assertEquals(1, re);
	}
	
	
}
