package com.showproject.hospital.controller;


import com.showproject.hospital.pojo.City;
import com.showproject.hospital.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public ResponseEntity<?> addCity(@RequestBody City city) {
        cityService.addCity(city);
        return ResponseEntity.ok("添加成功");
    }

    @GetMapping("/list")
    public ResponseEntity<List<City>> getAllCities() {
        return ResponseEntity.ok(cityService.getAllCities());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable Integer id) {
        cityService.deleteCity(id);
        return ResponseEntity.ok("删除成功");
    }
}