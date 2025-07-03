package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.RequiredMaterial;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface RequiredMaterialMapper {
    @Insert("INSERT INTO required_material (material_name, description) VALUES (#{materialName}, #{description})")
    int insertMaterial(RequiredMaterial material);

    @Update("UPDATE required_material SET material_name=#{materialName}, description=#{description} WHERE material_id=#{materialId}")
    int updateMaterial(RequiredMaterial material);

    @Delete("DELETE FROM required_material WHERE material_id=#{materialId}")
    int deleteMaterial(Integer materialId);

    @Select("SELECT material_id as materialId, material_name as materialName, description FROM required_material")
    List<RequiredMaterial> selectAllMaterials();
}
