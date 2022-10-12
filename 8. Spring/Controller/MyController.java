package com.care.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	@RequestMapping(value="index")
	public String memberIndex() {
		return "member/index";
	}
	
	@RequestMapping("login")
	public String memberLogin(Model model) {
		model.addAttribute("test", "연습중!");
		return "member/login";
	}
	
	@GetMapping("logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("logout","로그아웃입니다.");
		mv.setViewName("member/logout");
		return mv;
	}
}
