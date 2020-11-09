package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.HouseDealDao;
import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;

@Service
public class HouseDealServiceImpl implements HouseDealService {

	@Autowired
	HouseDealDao houseDealDao;

	@Override
	public List<HouseDealDto> searchDealDetails(String dong, String jibun) {
		return houseDealDao.searchDealDetails(dong, jibun);
	}
}
