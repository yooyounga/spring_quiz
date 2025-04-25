package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.Realestate;

@Mapper
public interface RealestateMapper {
	public Realestate selectRealestate(int id); 
	public List<Realestate> selectRealestateRentPrice(int rent_price); 
	public List<Realestate> selectRealestate3(@Param("area") int area,@Param("price") int price); 
	public int insertRealestate(Realestate realestate);
	public int insertRealestatebyRealtorId(Realestate realestate);
	public int insertRealestatebyRealtorId(
			@Param("realtorId") int realtorId,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") Integer rentPrice);
}
