package com.ssafy.practiceHappyhouse.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HouseInfoDto;
import com.ssafy.practiceHappyhouse.model.dto.SidoGugunCodeDto;

public interface HouseMapMapper {

	List<SidoGugunCodeDto> getSido() throws SQLException;
	List<SidoGugunCodeDto> getGugunInSido(String sido) throws SQLException;
	List<HouseInfoDto> getDongInGugun(String gugun) throws SQLException;
	List<HouseInfoDto> getAptInDong(String dong) throws SQLException;

}
