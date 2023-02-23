package com.iu.s2.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pagers;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="list")
	public ModelAndView getQnaList(Pagers pagers) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<QnaDTO> ar = qnaService.getQnaList(pagers);
		System.out.println("넘어오냐?2");
		
		mv.addObject("list", ar);
		mv.setViewName("./qna/list");
		return mv;
	}
	
	@RequestMapping(value="detail")
	public ModelAndView getQnaDetail(QnaDTO qnaDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaDTO = qnaService.getQnaDetail(qnaDTO);
		mv.addObject("detail", qnaDTO);
		mv.setViewName("./qna/detail");
		return mv;
	}
	@RequestMapping(value="add", method = RequestMethod.GET)
	public ModelAndView setQnaAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("./qna/add");
		return mv;
	}
	@RequestMapping(value="add", method = RequestMethod.POST)
	public ModelAndView setQnaAdd(MultipartFile pic,QnaDTO qnaDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int a = qnaService.setQnaAdd(qnaDTO, pic);
		mv.setViewName("redirect:./list");
		return mv;
	}
}
