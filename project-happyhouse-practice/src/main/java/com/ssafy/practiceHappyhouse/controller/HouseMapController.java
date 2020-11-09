package com.ssafy.practiceHappyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.practiceHappyhouse.model.dto.SidoGugunCodeDto;
import com.ssafy.practiceHappyhouse.model.service.HouseMapService;

@RestController
@RequestMapping("/map")
public class HouseMapController {

	@Autowired
	private HouseMapService housemapService;
	
	@RequestMapping(value = "/sido", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<SidoGugunCodeDto> getSido(){
		List<SidoGugunCodeDto> s = housemapService.getSido();
		System.out.println(s.size());
		return s;
	}
	
}