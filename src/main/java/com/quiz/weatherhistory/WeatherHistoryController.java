package com.quiz.weatherhistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quiz.weatherhistory.domain.WeatherHistory;
import com.quiz.weatherhistory.service.AddWeatherHistoryBO;
@RequestMapping("/weatherHistory")
@Controller
public class WeatherHistoryController {
	//Lesson04Quiz02Controller 참고하기
	@Autowired
	public AddWeatherHistoryBO addWeatherHistoryBO;
	
	@GetMapping("/add-weather-view")
	public String addWeatherHistoryView() {
		//http://localhost:8080/weatherHistory/add-weather-view
		//날씨등록화면
		return "weatherHistory/addWeather";
	}
	@GetMapping("/weather-history-view")
	public String viewWeatherHistory(@ModelAttribute WeatherHistory weatherHistory,Model model) {
		//날씨등록 자료 가져오기
		List<WeatherHistory> weatherHis=addWeatherHistoryBO.getWeatherHistory();
		model.addAttribute("weather", weatherHis);
		
		//날씨등록 후 리스트 보여주기 
		return "weatherHistory/weatherList";
	}
	@PostMapping("/weather-list-view")
	public String addWeatherHistory(@ModelAttribute WeatherHistory weatherHistory,Model model) {
		//AddWeatherHistoryBO DB insert
		addWeatherHistoryBO.addWeather(weatherHistory);
		//날씨등록 자료 가져오기
		List<WeatherHistory> weatherHis=addWeatherHistoryBO.getWeatherHistory();
		model.addAttribute("weather", weatherHis);
		
		//날씨등록 후 리스트 보여주기 
		return "weatherHistory/weatherList";
	}
}
