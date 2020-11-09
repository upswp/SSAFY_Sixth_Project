package com.ssafy.practiceHappyhouse.model.dao;

import com.ssafy.practiceHappyhouse.model.dto.MemberDto;

public interface MemberDao {
	MemberDto login(MemberDto member);
}
