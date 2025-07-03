package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    int insertCity(City city);
    List<City> selectAllCities();
    int deleteCityById(Integer cityId);
}