package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager;

@Controller
@RequestMapping(value="/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ModelAndView getNoticeList(ModelAndView mv, Pager pager) throws Exception{
		 List<NoticeDTO>ar=noticeService.getNoticeList(pager);
		 mv.addObject("list", ar);
		mv.setViewName("notice/list");
		return mv;
	}
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public ModelAndView getNoticeDetail(ModelAndView mv,NoticeDTO noticeDTO) throws Exception{
		noticeDTO=noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("detail", noticeDTO);
		mv.setViewName("notice/detail");
		return mv;
	}
	@RequestMapping(value="add", method=RequestMethod.GET)
	public ModelAndView getNoticeAdd(ModelAndView mv) throws Exception{
		
		mv.setViewName("notice/add");
		return mv;
	}
	@RequestMapping(value="add", method=RequestMethod.POST)
	public ModelAndView getNoticeAdd(ModelAndView mv ,NoticeDTO noticeDTO, MultipartFile pic) throws Exception{
		int re=noticeService.setNoticeAdd(noticeDTO,pic);
		mv.setViewName("redirect:./list");
		System.out.println(pic.getOriginalFilename());
		
		return mv;
	}
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView getNoticeUpdate(ModelAndView mv,NoticeDTO noticeDTO) throws Exception{
		noticeDTO=noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("update", noticeDTO);
		mv.setViewName("notice/update");
		return mv;
	}
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView getNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("up before");
		int re=noticeService.setNoticeUpdate(noticeDTO);
		System.out.println(noticeDTO.getTitle());
		mv.setViewName("redirect:./list");
		return mv;
	}
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public ModelAndView getNoticeDelete(ModelAndView mv,NoticeDTO noticeDTO) throws Exception{
		
		int re=noticeService.setNoticeDelete(noticeDTO);
		
		mv.setViewName("redirect:./list");
		return mv;
	}
	
}
