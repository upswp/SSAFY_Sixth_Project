package com.ssafy.practiceHappyhouse.model.dao;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;

public interface HouseDealDao {
	List<HouseDealDto> searchDealDetails(String dong, String jibun);
}
