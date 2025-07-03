package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.SalesLocation;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SalesLocationMapper {
    int insertSalesLocation(SalesLocation location);
    int updateSalesLocation(SalesLocation location);
    int deleteSalesLocation(Integer locationId);
    List<SalesLocation> selectAllSalesLocations();
    SalesLocation selectSalesLocationById(Integer locationId);

    // 可选：按城市ID筛选
    List<SalesLocation> selectSalesLocationsByCityId(Integer cityId);
}