package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.SalesLocationMapper;
import com.showproject.hospital.pojo.SalesLocation;
import com.showproject.hospital.service.SalesLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesLocationServiceImpl implements SalesLocationService {
    @Autowired
    private SalesLocationMapper salesLocationMapper;

    @Override
    public int addSalesLocation(SalesLocation location) {
        return salesLocationMapper.insertSalesLocation(location);
    }

    @Override
    public int updateSalesLocation(SalesLocation location) {
        return salesLocationMapper.updateSalesLocation(location);
    }

    @Override
    public int deleteSalesLocation(Integer locationId) {
        return salesLocationMapper.deleteSalesLocation(locationId);
    }

    @Override
    public List<SalesLocation> getAllSalesLocations() {
        return salesLocationMapper.selectAllSalesLocations();
    }

    @Override
    public SalesLocation getSalesLocationById(Integer locationId) {
        return salesLocationMapper.selectSalesLocationById(locationId);
    }
}