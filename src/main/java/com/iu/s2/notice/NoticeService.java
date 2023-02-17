package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getNoticeList() throws Exception{
		return noticeDAO.getNoticeList();
	}
	public void getNoticeDetail() {
		
		
	}
	public int setNoticeAdd(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeAdd(noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeDelete(noticeDTO);
	}
}
