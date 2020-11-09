package com.ssafy.practiceHappyhouse.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ssafy.practiceHappyhouse.model.dto.NoticeBookDto;


public interface NoticeBookMapper {

	public void writeArticle(NoticeBookDto guestBookDto) throws SQLException;
	public List<NoticeBookDto> listArticle(Map<String, Object> map) throws SQLException;
	public int getTotalCount(Map<String, String> map) throws SQLException;
	
	public NoticeBookDto getArticle(int articleno) throws SQLException;
	public void modifyArticle(NoticeBookDto guestBookDto) throws SQLException;
	public void deleteArticle(int articleno) throws SQLException;
	
}
