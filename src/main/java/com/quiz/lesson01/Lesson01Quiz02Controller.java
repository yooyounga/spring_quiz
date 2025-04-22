package com.quiz.lesson01;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController //@Controller + @ResponseBody
public class Lesson01Quiz02Controller {
	
	//http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String,Object>> quiz02_1(){
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>() {
		    { 
		        put("rate", 15);
		        put("director", "봉준호"); 
		        put("time", 131); 
		        put("title", "기생충");
		    } 
		};
		list.add(map);
		
		map = new HashMap<String, Object>() {
		    { 
		        put("rate", 0);
		        put("director", "로베르토 베니니"); 
		        put("time", 116); 
		        put("title", "인생은 아름다워");
		    } 
		};
		list.add(map);
		
		map = new HashMap<String, Object>() {
		    { 
		        put("rate", 12);
		        put("director", "크리스토퍼 놀란"); 
		        put("time", 147); 
		        put("title", "인셉션");
		    } 
		};
		list.add(map);
		
		map = new HashMap<String, Object>() {
			{ 
				put("rate", 19);
				put("director", "윤종빈"); 
				put("time", 133); 
				put("title", "범죄와의 전쟁:나쁜놈들 전성시대");
			} 
		};
		list.add(map);
		
		map = new HashMap<String, Object>() {
			{ 
				put("rate", 15);
				put("director", "프란시스 로렌스"); 
				put("time", 137); 
				put("title", "헝거게임");
			} 
		};
		list.add(map);
		
		return list;
	}
	@RequestMapping("/2")
	public List<Lesson01Quiz02Data> quiz02_2(){
		List<Lesson01Quiz02Data> list = new ArrayList<>();
		
		Lesson01Quiz02Data oLesson01Quiz02Data=new Lesson01Quiz02Data();
		oLesson01Quiz02Data.setTitle("안녕하세요 가입인사 드립니다.");
		oLesson01Quiz02Data.setUser("maroniana");
		oLesson01Quiz02Data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		list.add(oLesson01Quiz02Data);
		
		oLesson01Quiz02Data=new Lesson01Quiz02Data();
		oLesson01Quiz02Data.setTitle("헐 대박.");
		oLesson01Quiz02Data.setUser("baba");
		oLesson01Quiz02Data.setContent("오늘 목요일이었어... 금요일인줄");
		list.add(oLesson01Quiz02Data);
		
		oLesson01Quiz02Data=new Lesson01Quiz02Data();
		oLesson01Quiz02Data.setTitle("오늘 데이트한 이야기 해 드릴께요");
		oLesson01Quiz02Data.setUser("dulumary");
		oLesson01Quiz02Data.setContent("....");
		list.add(oLesson01Quiz02Data);
		
		return list;
	}

	@RequestMapping("/3")
	public ResponseEntity<Lesson01Quiz02Data> quiz02_3(){
		Lesson01Quiz02Data oLesson01Quiz02Data=new Lesson01Quiz02Data();
		oLesson01Quiz02Data.setTitle("안녕하세요 가입인사 드립니다.");
		oLesson01Quiz02Data.setUser("maroniana");
		oLesson01Quiz02Data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		/*
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(oLesson01Quiz02Data);
		*/
		
		return new ResponseEntity<>(oLesson01Quiz02Data,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
