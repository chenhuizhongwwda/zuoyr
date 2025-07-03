package com.showproject.hospital.service;

import com.showproject.hospital.pojo.RequiredMaterial;
import com.showproject.hospital.utils.ResponseData;

public interface RequiredMaterialService {
    ResponseData addMaterial(RequiredMaterial material);
    ResponseData updateMaterial(RequiredMaterial material);
    ResponseData deleteMaterial(Integer materialId);
    ResponseData listMaterials();
}
