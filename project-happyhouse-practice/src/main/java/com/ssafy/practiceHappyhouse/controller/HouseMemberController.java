package com.ssafy.practiceHappyhouse.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.servlet.http.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;
import com.ssafy.practiceHappyhouse.model.service.MemberService;

import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("/user")
public class HouseMemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HouseMemberController.class);
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session,
			HttpServletResponse response) {
		logger.debug("===================================로그인 진행중.===================================");
		try {
			MemberDto memberDto = memberService.login(map);
			if (memberDto != null) {
				session.setAttribute("userinfo", memberDto);

				Cookie cookie = new Cookie("ssafy_id", memberDto.getUserid());
				cookie.setPath("/");
				if ("saveok".equals(map.get("idsave"))) {
					cookie.setMaxAge(60 * 60 * 24 * 365 * 40);// 40년간 저장.
				} else {
					cookie.setMaxAge(0);
				}
				response.addCookie(cookie);

			} else {
				model.addAttribute("msg", "아이디 또는 비밀번호 확인 후 로그인해 주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "로그인 중 문제가 발생했습니다.");
			return "error/error";
		}
		return "index";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public String userRegister(MemberDto memberDto) {
		memberService.userRegister(memberDto);
		return "user/login";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "user/list";
	}
}
