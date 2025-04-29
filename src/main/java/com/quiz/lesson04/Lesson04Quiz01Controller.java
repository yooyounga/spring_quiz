package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.service.AddSellerBO;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	@Autowired
	private AddSellerBO addSellerBO;
	//http://localhost:8080/lesson04/quiz01/add-seller-view
	@RequestMapping("/add-seller-view")
	public String addSellerView() {
		
		return "/lesson04/addseller";
	}
	@PostMapping("/add-seller")
	public String addSeller(
		@RequestParam("nickname") String nickname
		,@RequestParam(value="profileImageUrl",required = false) String profileImageUrl
		,@RequestParam(value="temperature",required = false) Double temperature
		) {
		//DB insert
		addSellerBO.addseller(nickname, profileImageUrl, temperature);
		
		return "/lesson04/afteraddseller";
	}
	//판매자 보여주기
	@RequestMapping("/seller-info-view")
	public String sellerInfoView() {
		//DB select
		return "/lesson04/sellerinfo";
	}
}
