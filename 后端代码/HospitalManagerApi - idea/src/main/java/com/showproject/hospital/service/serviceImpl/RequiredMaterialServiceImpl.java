package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.RequiredMaterialMapper;
import com.showproject.hospital.pojo.RequiredMaterial;
import com.showproject.hospital.service.RequiredMaterialService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RequiredMaterialServiceImpl implements RequiredMaterialService {
    @Autowired
    private RequiredMaterialMapper mapper;

    @Override
    public ResponseData addMaterial(RequiredMaterial material) {
        mapper.insertMaterial(material);
        return ResponseData.success("添加成功");
    }

    @Override
    public ResponseData updateMaterial(RequiredMaterial material) {
        mapper.updateMaterial(material);
        return ResponseData.success("修改成功");
    }

    @Override
    public ResponseData deleteMaterial(Integer materialId) {
        mapper.deleteMaterial(materialId);
        return ResponseData.success("删除成功");
    }

    @Override
    public ResponseData listMaterials() {
        return ResponseData.success(mapper.selectAllMaterials());
    }
}
