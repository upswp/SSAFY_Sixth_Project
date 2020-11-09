package com.ssafy.practiceHappyhouse.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	String ns = "member.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public MemberDto login(MemberDto member) {
		return sqlSession.selectOne(ns + "login", member);
	}
}
