package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.ClinicDto;

public interface ClinicService {
	List<ClinicDto> searchClinics(String gugun) ;
}
