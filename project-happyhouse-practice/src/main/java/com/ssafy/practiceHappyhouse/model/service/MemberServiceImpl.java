package com.ssafy.practiceHappyhouse.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.MemberDao;
import com.ssafy.practiceHappyhouse.model.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao dao;

	@Override
	public MemberDto login(MemberDto member) {
		return dao.login(member);
	}
}
