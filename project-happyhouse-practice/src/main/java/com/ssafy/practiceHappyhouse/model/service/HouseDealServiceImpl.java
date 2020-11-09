package com.ssafy.practiceHappyhouse.model.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.HouseDealMapper;
import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;

@Service
public class HouseDealServiceImpl implements HouseDealService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<HouseDealDto> getAptInfo(String dong) throws SQLException{
		return sqlSession.getMapper(HouseDealMapper.class).getAptInfo(dong);
	}
}
