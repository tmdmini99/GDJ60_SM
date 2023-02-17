package com.iu.s2.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s2.util.FileManager;

@Service
public class NoticeService {
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getNoticeList() throws Exception{
		return noticeDAO.getNoticeList();
	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.getNoticeDetail(noticeDTO);
		
	}
	public int setNoticeAdd(NoticeDTO noticeDTO,MultipartFile pic) throws Exception{
		int a=noticeDAO.setNoticeAdd(noticeDTO);
		String realPath=servletContext.getRealPath("/resources/notice/img");
		
		FileManager fileManager = new FileManager();
		String name=fileManager.fileSave(pic, realPath);
		NoticeImgDTO noticeImgDTO= new NoticeImgDTO();
		
		noticeImgDTO.setFileName(name);
		noticeImgDTO.setOriName(pic.getOriginalFilename());
		noticeImgDTO.setNoticeNum(noticeDTO.getNoticeNum());
		a=noticeDAO.setNoticeFileAdd(noticeImgDTO);
		return a;
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.setNoticeDelete(noticeDTO);
	}
}
