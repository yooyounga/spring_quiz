package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.domain.Realtor;
import com.quiz.lesson04.service.AddRealtorBO;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {
	@Autowired
	private AddRealtorBO addRealBO;
	@GetMapping("/add-realtor-view")
	public String addRealtorView() {
		//http://localhost:8080/lesson04/quiz02/add-realtor-view
		//가입화면
		
		return "lesson04/addRealtor";
	}
	@PostMapping("/add-realtor")
	public String addRealtor(@ModelAttribute Realtor realtor,Model model) {
		//실제가입 DB insert
		addRealBO.addRealtor(realtor);
		//가입한 자료 가져오기
		Realtor newRealtor = addRealBO.getRealtorById(realtor.getId());
		//가입후 보여주기 
		model.addAttribute("realtor", newRealtor);
		
		return "lesson04/afterAddRealtor";
	}
	
	
}
