package com.iu.s2.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
		mv.addObject("pager", pagers);
		mv.addObject("list", ar);
		mv.setViewName("./qna/list");
		return mv;
	}
}
