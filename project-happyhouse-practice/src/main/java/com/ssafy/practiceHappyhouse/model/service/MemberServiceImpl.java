package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.MemberMapper;
import com.ssafy.practiceHappyhouse.model.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MemberDto login(Map<String, String> map) throws Exception {
		if(map.get("userid") == null || map.get("userpwd") == null)
			return null;
		return sqlSession.getMapper(MemberMapper.class).login(map);
	}

	@Override
	public List<MemberDto> userList() {
		return sqlSession.getMapper(MemberMapper.class).userList();
	}

	@Override
	public MemberDto userInfo(String userid) {
		return sqlSession.getMapper(MemberMapper.class).userInfo(userid);
	}

	@Override
	public void userRegister(MemberDto memberDto) {
		sqlSession.getMapper(MemberMapper.class).userRegister(memberDto);
	}

	@Override
	public void userModify(MemberDto memberDto) {
		sqlSession.getMapper(MemberMapper.class).userModify(memberDto);
	}

	@Override
	public void userDelete(String userid) {
		sqlSession.getMapper(MemberMapper.class).userDelete(userid);
	}

	@Override
	public MemberDto join(MemberDto memberDto) throws Exception {
		return sqlSession.insert(memberDto);
	}
}
