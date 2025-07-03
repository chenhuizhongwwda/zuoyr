package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.SalesLocation;
import com.showproject.hospital.service.SalesLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales-location")
public class SalesLocationController {
    @Autowired
    private SalesLocationService salesLocationService;

    // 新增销售地点
    @PostMapping("/add")
    public int addSalesLocation(@RequestBody SalesLocation location) {
        return salesLocationService.addSalesLocation(location);
    }

    // 更新销售地点
    @PutMapping("/update/{id}")
    public int updateSalesLocation(@PathVariable Integer id, @RequestBody SalesLocation location) {
        location.setLocationId(id);
        return salesLocationService.updateSalesLocation(location);
    }

    // 删除销售地点
    @DeleteMapping("/delete/{id}")
    public int deleteSalesLocation(@PathVariable Integer id) {
        return salesLocationService.deleteSalesLocation(id);
    }

    // 获取所有销售地点
    @GetMapping("/list")
    public List<SalesLocation> getAllSalesLocations() {
        return salesLocationService.getAllSalesLocations();
    }

    // 获取单个销售地点（可选）
    @GetMapping("/{id}")
    public SalesLocation getSalesLocationById(@PathVariable Integer id) {
        return salesLocationService.getSalesLocationById(id);
    }
}