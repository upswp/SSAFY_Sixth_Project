package com.ssafy.practiceHappyhouse.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.practiceHappyhouse.model.dto.NoticeBookDto;
import com.ssafy.util.PageNavigation;


public interface NoticeService {

	public void writeArticle(NoticeBookDto guestBookDto) throws Exception;
	public List<NoticeBookDto> listArticle(Map<String, String> map) throws Exception;
	public PageNavigation makePageNavigation(Map<String, String> map) throws Exception;
	
	public NoticeBookDto getArticle(int articleno) throws Exception;
	public void modifyArticle(NoticeBookDto guestBookDto) throws Exception;
	public void deleteArticle(int articleno) throws Exception;
	
}
