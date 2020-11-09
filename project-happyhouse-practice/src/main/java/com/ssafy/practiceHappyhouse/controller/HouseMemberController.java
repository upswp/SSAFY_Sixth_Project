package com.ssafy.practiceHappyhouse.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;
import com.ssafy.practiceHappyhouse.model.service.MemberService;


@Controller
public class HouseMemberController {
	private static final Logger logger = 
			LoggerFactory.getLogger(HouseMemberController.class);
	
	@Autowired
	private MemberService mservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberDto member,Model model,HttpServletRequest request) {
		logger.info("[POST] /login");
		System.out.println(member);
		MemberDto userinfo = mservice.login(member);
		if(userinfo==null) {
			logger.info("[POST] /login - 로그인 실패");
			return "redirect:/";
		}else {
			logger.info("[POST] /login - 로그인 성공");
			request.getSession().setAttribute("loginUser", userinfo);
			return "redirect:/register";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		logger.info("[GET] /logout");
		request.getSession().invalidate();
		return "redirect:/";
	}
}
