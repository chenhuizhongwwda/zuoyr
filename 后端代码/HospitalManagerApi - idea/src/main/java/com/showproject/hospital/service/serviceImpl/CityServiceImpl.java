package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.CityMapper;
import com.showproject.hospital.pojo.City;
import com.showproject.hospital.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public int addCity(City city) {
        return cityMapper.insertCity(city);
    }

    @Override
    public List<City> getAllCities() {
        return cityMapper.selectAllCities();
    }

    @Override
    public int deleteCity(Integer cityId) {
        return cityMapper.deleteCityById(cityId);
    }
}