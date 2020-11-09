package com.ssafy.practiceHappyhouse.model.dao;

import java.util.List;

import com.ssafy.practiceHappyhouse.model.dto.ClinicDto;

public interface ClinicDao {
	List<ClinicDto> searchClinics(String gugun);
}
