package com.ssafy.practiceHappyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.practiceHappyhouse.model.dto.HouseDealDto;
import com.ssafy.practiceHappyhouse.model.service.HouseDealService;

@RestController
@RequestMapping("/deal")
public class HouseDealController {
	@Autowired
	private HouseDealService housedealService;
	@RequestMapping(value = "/dong/{dong}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<HouseDealDto> getAptInfo(@PathVariable("dong") String dong) throws Exception {
		return housedealService.getAptInfo(dong);
	}
}
