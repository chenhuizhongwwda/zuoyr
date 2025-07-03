package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.RequiredMaterial;
import com.showproject.hospital.service.RequiredMaterialService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requiredMaterial")
public class RequiredMaterialController {
    @Autowired
    private RequiredMaterialService service;

    @PostMapping("/add")
    public ResponseData add(@RequestBody RequiredMaterial material) {
        return service.addMaterial(material);
    }

    @PostMapping("/update")
    public ResponseData update(@RequestBody RequiredMaterial material) {
        return service.updateMaterial(material);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseData delete(@PathVariable Integer id) {
        return service.deleteMaterial(id);
    }

    @GetMapping("/list")
    public ResponseData list() {
        return service.listMaterials();
    }
}
