package com.ssafy.practiceHappyhouse.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;
import com.ssafy.practiceHappyhouse.model.dto.HouseInfoDto;

public interface HouseDealService {

	List<HouseDealDto> getAptInfo(String dong) throws SQLException;
}
