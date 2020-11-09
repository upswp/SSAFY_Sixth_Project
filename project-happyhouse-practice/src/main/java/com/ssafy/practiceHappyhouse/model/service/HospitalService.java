package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HospitalDto;

public interface HospitalService {
	List<HospitalDto> searchHospitals(String gugun);
}
