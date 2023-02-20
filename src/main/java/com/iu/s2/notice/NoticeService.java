package com.iu.s2.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s2.util.FileManager;
import com.iu.s2.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getNoticeList(Pager pager) throws Exception{
		Long totalCount = noticeDAO.getNoticeCount(pager);//
		
		pager.makeNum(totalCount);
		pager.makeRow();
		
		
		return noticeDAO.getNoticeList(pager);
	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		
		int a=noticeDAO.setNoticeUpdate1(noticeDTO);
		return noticeDAO.getNoticeDetail(noticeDTO);
		
	}
	public int setNoticeAdd(NoticeDTO noticeDTO,MultipartFile pic) throws Exception{
		int a=noticeDAO.setNoticeAdd(noticeDTO);
		String realPath=servletContext.getRealPath("/resources/notice/img");
		System.out.println(realPath);
		System.out.println(a==1);
		FileManager fileManager = new FileManager();
		String name=fileManager.fileSave(pic, realPath);
		NoticeImgDTO noticeImgDTO= new NoticeImgDTO();
		
		noticeImgDTO.setFileName(name);
		noticeImgDTO.setOriName(pic.getOriginalFilename());
		noticeImgDTO.setNoticeNum(noticeDTO.getNoticeNum());
		System.out.println(noticeDTO.getNoticeNum());
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
