package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/quiz01")
public class Lesson01Quiz01Controller {

	@ResponseBody
	@RequestMapping("/1")
	public String quiz01_1() {
		return "<h2>테스트 프로젝트 완성</h2><br><h3>해당프로젝트를 통해서 문제 풀이를 진행합니다.</h3>";
	}
	@ResponseBody
	@RequestMapping("/subjects")
	public Map<String,Object> quiz01_2(){
		Map<String ,Object> subjects= new HashMap<>();
		
		subjects.put("국어", 80);
		subjects.put("수학", 95);
		subjects.put("영어", 100);
		
		return subjects;
	}
}
