package com.ssafy.practiceHappyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;
import com.ssafy.practiceHappyhouse.model.service.MemberService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<MemberDto> userList() {
		return memberService.userList();
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<MemberDto> userRegister(@RequestBody MemberDto memberDto) {
		memberService.userRegister(memberDto);
		return memberService.userList();
	}
	
	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public MemberDto userInfo(@PathVariable("userid") String userid) {
		return memberService.userInfo(userid);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
	public List<MemberDto> userModify(@RequestBody MemberDto memberDto) {
		memberService.userModify(memberDto);
		return memberService.userList();
	}
	
	@RequestMapping(value = "/user/{userid}", method = RequestMethod.DELETE, headers = { "Content-type=application/json" })
	public List<MemberDto> userDelete(@PathVariable("userid") String userid) {
		memberService.userDelete(userid);
		return memberService.userList();
	}
	
}
