package com.ssafy.practiceHappyhouse.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssafy.practiceHappyhouse.model.dto.HouseInfoDto;
import com.ssafy.practiceHappyhouse.model.dto.SidoGugunCodeDto;
@Repository
public class HouseMapDaoImpl implements HouseMapDao {

	@Override
	public List<SidoGugunCodeDto> getSido() {
		return null;
	}

	@Override
	public List<SidoGugunCodeDto> getGugunInSido(String sido) {
		return null;
	}

	@Override
	public List<HouseInfoDto> getDongInGugun(String gugun) {
		return null;
	}

	@Override
	public List<HouseInfoDto> getAptInDong(String dong) {
		return null;
	}

}
