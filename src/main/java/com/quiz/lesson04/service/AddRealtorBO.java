package com.quiz.lesson04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Realtor;
import com.quiz.lesson04.mapper.AddRealtorMapper;

@Service
public class AddRealtorBO {
	@Autowired
	private AddRealtorMapper addRealtorMapper;
	public void addRealtor(Realtor realtor) {
		addRealtorMapper.insertRealtor(realtor);
	}
	public Realtor getRealtorById(int id) {
		return addRealtorMapper.selectRealtorById(id);
	}
}
