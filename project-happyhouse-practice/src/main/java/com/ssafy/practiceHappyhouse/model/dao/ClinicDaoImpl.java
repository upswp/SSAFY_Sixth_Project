package com.ssafy.practiceHappyhouse.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.practiceHappyhouse.model.dto.ClinicDto;

@Repository
public class ClinicDaoImpl implements ClinicDao {
	
	String ns = "member.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ClinicDto> searchClinics(String gugun) {
		return sqlSession.selectList();
	}
}
