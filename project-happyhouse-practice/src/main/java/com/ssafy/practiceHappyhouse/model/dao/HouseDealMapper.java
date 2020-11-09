package com.ssafy.practiceHappyhouse.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;

public interface HouseDealMapper {

	List<HouseDealDto> getAptInfo(String dong) throws SQLException;

}
