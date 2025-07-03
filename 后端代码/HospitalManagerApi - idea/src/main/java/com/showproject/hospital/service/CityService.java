package com.showproject.hospital.service;

import com.showproject.hospital.pojo.City;

import java.util.List;

public interface CityService {
    int addCity(City city);
    List<City> getAllCities();
    int deleteCity(Integer cityId);
}