package com.quiz.lesson04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.SellerInfo;
import com.quiz.lesson04.mapper.AddSellerMapper;

@Service
public class AddSellerBO {
	@Autowired
	private AddSellerMapper addSellerMapper;
	
	public void addseller(
			String nickname
			,String profileImageUrl
			,Double temperature
			) {
		addSellerMapper.insertSeller(nickname,profileImageUrl,temperature);
	}
	public SellerInfo getSeller() {
		return addSellerMapper.selectSellerInfoLast();
	}
	public SellerInfo getSellerById(int id) {
		return addSellerMapper.selectSellerbyId(id);
	}
}
