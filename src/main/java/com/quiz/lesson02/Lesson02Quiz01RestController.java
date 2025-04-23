package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.service.StoreBO;

@RestController
public class Lesson02Quiz01RestController {
	@Autowired //spring bean 
	private  StoreBO storeBO;
	
	@RequestMapping("/lesson02/quiz01")
	public List<Store> ex01(){
		return storeBO.getStoreList();
		
	}
}
