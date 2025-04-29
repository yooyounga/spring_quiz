package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddSellerMapper {
	public int insertSeller(
			@Param("nickname") String nickname
			,@Param("profileImageUrl") String profileImageUrl
			,@Param("temperature") Double temperature
			);
	
	public String selectSellerInfoLast();
}
