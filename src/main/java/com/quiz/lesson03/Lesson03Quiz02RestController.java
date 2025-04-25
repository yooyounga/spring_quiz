package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.domain.Realestate;
import com.quiz.lesson03.service.RealestateBO;

@RequestMapping("/lesson03/quiz02")
@RestController
public class Lesson03Quiz02RestController {
	@Autowired
	private RealestateBO realestateBO;
	
	//http://localhost:8080/lesson03/quiz02/1
	@RequestMapping("/1")
	public String quiz02_1() {
		Realestate realestate =new Realestate();
		realestate.setRealtorId(3);
		realestate.setAddress("푸르지용 리버 303동 1104호");
		realestate.setArea(89);
		realestate.setType("매매");
		realestate.setPrice(100000);
		
		return "입력 성공:"+realestateBO.addNewRealestateInsert(realestate);
	}
	
	@RequestMapping("/2")
	public String quiz02_2(@RequestParam("realtor_id") int realtorId) {
		int rowCount= realestateBO.addNewRealestateInsertbyRealtorId(realtorId,"썅떼빌리버 오피스텔 814호",45,"월세",100000,120);
		
		return "입력 성공:"+rowCount;
	}
}
