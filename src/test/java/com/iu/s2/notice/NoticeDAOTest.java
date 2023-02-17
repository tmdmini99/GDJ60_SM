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
	
	//@Test
	public void getNoticeList() throws Exception{
		List<NoticeDTO>ar=noticeDAO.getNoticeList();
		assertEquals(0,ar.size());
	}
	//@Test
	public void setNoticeAdd() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeTitle("테스트");
		noticeDTO.setNoticeContents("컨텐츠");
		noticeDTO.setNoticeWriter("안녕하세요하세요");
		int re=noticeDAO.setNoticeAdd(noticeDTO);
		
		assertEquals(1, re);
	}
	
	@Test
	public void setNoticeUpdate() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeNum(4L);
		noticeDTO.setNoticeTitle("테스트12");
		noticeDTO.setNoticeContents("contents");
		noticeDTO.setNoticeWriter("gd");
		noticeDTO.setNoticeHit(4L);
		int re= noticeDAO.setNoticeUpdate(noticeDTO);
		
		assertEquals(1, re);
	}
	
	
	//@Test
		public void setNoticeDelete() throws Exception{
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNoticeNum(3L);
			int re=noticeDAO.setNoticeDelete(noticeDTO);
			
			assertEquals(1, re);
			
		}
		//@Test
		public void getNoticeDetail() throws Exception{
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNoticeNum(4L);
			 noticeDTO=noticeDAO.getNoticeDetail(noticeDTO);
			 assertNotNull(noticeDTO);
			
		}
	
}
