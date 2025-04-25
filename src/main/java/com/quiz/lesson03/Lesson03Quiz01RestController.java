package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.domain.Realestate;
import com.quiz.lesson03.service.RealestateBO;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	@Autowired
	public RealestateBO realestateBO;
	//http://localhost:8080/lesson03/quiz01/1
	@RequestMapping("/1")
	public Realestate quiz01_1(
			@RequestParam(value="id",defaultValue ="1") int id
			) {
		return realestateBO.getRealestate(id);
	}
	
	//http://localhost:8080/lesson03/quiz01/2
	@RequestMapping("/2")
	public List<Realestate> quiz01_2(
			@RequestParam(value="rent_price",defaultValue ="90") int rent_price
			) {
		return realestateBO.getRealestateRentPrice(rent_price);
	}
	//http://localhost:8080/lesson03/quiz01/3?area=90&price=130000
	
	@RequestMapping("/3")
	public List<Realestate> quiz01_3(
			@RequestParam(value="area",defaultValue ="90") int area,
			@RequestParam(value="price",defaultValue ="130000") int price
			) {
		return realestateBO.getRealestate3(area,price);
	}
}
