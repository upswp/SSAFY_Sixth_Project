package com.ssafy.practiceHappyhouse.model.dao;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.HospitalDto;

public interface HospitalDao {
	List<HospitalDto> searchHospitals(String gugun);
}
