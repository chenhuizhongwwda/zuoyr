package com.showproject.hospital.service;


import com.showproject.hospital.pojo.SalesLocation;

import java.util.List;

public interface SalesLocationService {
    int addSalesLocation(SalesLocation location);
    int updateSalesLocation(SalesLocation location);
    int deleteSalesLocation(Integer locationId);
    List<SalesLocation> getAllSalesLocations();
    SalesLocation getSalesLocationById(Integer locationId);
}