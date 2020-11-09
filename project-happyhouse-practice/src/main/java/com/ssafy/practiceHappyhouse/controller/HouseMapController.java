package com.ssafy.practiceHappyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.practiceHappyhouse.model.dto.HouseInfoDto;
import com.ssafy.practiceHappyhouse.model.dto.MemberDto;
import com.ssafy.practiceHappyhouse.model.dto.SidoGugunCodeDto;
import com.ssafy.practiceHappyhouse.model.service.HouseMapService;

@RestController
@RequestMapping("/map")
public class HouseMapController {

	@Autowired
	private HouseMapService housemapService;
	
	@RequestMapping(value = "/sido", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<SidoGugunCodeDto> getSido() throws Exception{
		return housemapService.getSido();
	}
	
	@RequestMapping(value = "/sido/{sidoCode}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<SidoGugunCodeDto> getGugunInSido(@PathVariable("sidoCode") String sido) throws Exception {
		return housemapService.getGugunInSido(sido);
	}
	
	@RequestMapping(value = "/gugun/{gugunCode}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
	public List<HouseInfoDto> getDongInGugun(@PathVariable("gugunCode") String gugun) throws Exception {
		return housemapService.getDongInGugun(gugun);
	}
}