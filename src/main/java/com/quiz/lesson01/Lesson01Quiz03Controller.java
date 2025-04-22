package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03Controller {
	//ReponseBody가 아닌 상태로 String을 리턴하면 ViewResolver에 의해 리턴된 html 경로를 찾아 간다.
	
	//http://localhost:8080/lesson01/quiz03/1
	@RequestMapping("/lesson01/quiz03/1")
	public String quiz03_1() {//ReponseBody를 선언하지 않고 String으로 간다는 의미는 view로 간다는 의미
		return "lesson01/quiz03"; 
	}
}