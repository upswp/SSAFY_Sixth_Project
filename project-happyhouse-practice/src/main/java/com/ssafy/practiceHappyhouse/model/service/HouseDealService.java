package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;

public interface HouseDealService {

	List<HouseDealDto> searchDealDetails(String dong, String jibun) ;
}
