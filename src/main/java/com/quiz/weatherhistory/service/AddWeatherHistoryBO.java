package com.quiz.weatherhistory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.Realestate;
import com.quiz.lesson04.domain.Realtor;
import com.quiz.weatherhistory.domain.WeatherHistory;
import com.quiz.weatherhistory.mapper.AddWeatherMapper;

@Service
public class AddWeatherHistoryBO {
	@Autowired
	public AddWeatherMapper addWeatherMapper;
	public void addWeather(WeatherHistory weatherHistory) {
		addWeatherMapper.insertWeather(weatherHistory);
	}
	public List<WeatherHistory> getWeatherHistory(){
		return addWeatherMapper.selectWeatherHistory();
	}
}
