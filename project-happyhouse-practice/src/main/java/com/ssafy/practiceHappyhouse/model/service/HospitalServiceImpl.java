package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.HospitalDao;
import com.ssafy.practiceHappyhouse.model.dto.HospitalDto;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public List<HospitalDto> searchHospitals(String gugun) {
		return hospitalDao.searchHospitals(gugun);
	}

}
