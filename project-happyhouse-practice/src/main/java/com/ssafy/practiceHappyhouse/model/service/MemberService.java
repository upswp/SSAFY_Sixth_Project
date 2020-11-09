package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;

public interface MemberService {

	public MemberDto login(Map<String, String> map) throws Exception;
	
	
	
	public List<MemberDto> userList();
	public MemberDto userInfo(String userid);
	public void userRegister(MemberDto memberDto);
	public void userModify(MemberDto memberDto);
	public void userDelete(String userid);

	
}
