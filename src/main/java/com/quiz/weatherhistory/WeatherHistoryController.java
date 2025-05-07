package com.quiz.weatherhistory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quiz.weatherhistory.domain.WeatherHistory;

@RequestMapping("/weatherHistory")
@Controller
public class WeatherHistoryController {
	//Lesson04Quiz02Controller 참고하기
	@GetMapping("/add-weather-view")
	public String addWeatherHistoryView() {
		//http://localhost:8080/weatherHistory/add-weather-view
		//날씨등록화면
		return "weatherHistory/addWeather";
	}
	@PostMapping("/weather-list-view")
	public String addWeatherHistory(@ModelAttribute WeatherHistory weatherHistory,Model model) {
		//날씨등록 DB insert
		//날씨등록 자료 가져오기
		//날씨등록 후 리스트 보여주기 
		return "weatherHistory/weatherList";
	}
}
