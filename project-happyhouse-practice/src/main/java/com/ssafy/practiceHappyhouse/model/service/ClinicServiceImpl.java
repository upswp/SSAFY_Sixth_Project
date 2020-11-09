package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.practiceHappyhouse.model.dao.ClinicDao;
import com.ssafy.practiceHappyhouse.model.dto.ClinicDto;

@Service
public class ClinicServiceImpl implements ClinicService {

	@Autowired
	private ClinicDao clinicDao; 
	
	@Override
	public List<ClinicDto> searchClinics(String gugun) {
		return clinicDao.searchClinics(gugun);
	}
}
