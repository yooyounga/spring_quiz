package com.quiz.lesson03.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.Realestate;
import com.quiz.lesson03.mapper.RealestateMapper;

@Service
public class RealestateBO {
	@Autowired
	public RealestateMapper realestateMapper;
	
	public Realestate getRealestate(int id){
		return realestateMapper.selectRealestate(id);
	}
	public List<Realestate> getRealestateRentPrice(int rent_price){
		return realestateMapper.selectRealestateRentPrice(rent_price);
	}
	public List<Realestate> getRealestate3(int area,int price){
		return realestateMapper.selectRealestate3(area,price);
	}
}
