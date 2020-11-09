package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.HouseMapDao;
import com.ssafy.practiceHappyhouse.model.dto.HouseInfoDto;
import com.ssafy.practiceHappyhouse.model.dto.SidoGugunCodeDto;

@Service
public class HouseMapServiceImpl implements HouseMapService {

	@Autowired
	HouseMapDao houseMapDao;
	
	
	@Override
	public List<SidoGugunCodeDto> getSido() {
		return houseMapDao.getSido();
	}

	@Override
	public List<SidoGugunCodeDto> getGugunInSido(String sido) {
		return houseMapDao.getGugunInSido(sido);
	}

	@Override
	public List<HouseInfoDto> getDongInGugun(String gugun) {
		return houseMapDao.getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfoDto> getAptInDong(String dong) {
		return houseMapDao.getAptInDong(dong);
	}

}
