package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.PharmaCompany;
import com.showproject.hospital.service.PharmaCompanyService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmaCompany")
public class PharmaCompanyController {
    @Autowired
    private PharmaCompanyService pharmaCompanyService;

    @PostMapping("/add")
    public ResponseData addCompany(@RequestBody PharmaCompany company) {
        return pharmaCompanyService.addCompany(company);
    }

    @PostMapping("/update")
    public ResponseData updateCompany(@RequestBody PharmaCompany company) {
        return pharmaCompanyService.updateCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseData deleteCompany(@PathVariable Integer id) {
        return pharmaCompanyService.deleteCompany(id);
    }

    @GetMapping("/get/{id}")
    public ResponseData getCompany(@PathVariable Integer id) {
        return pharmaCompanyService.getCompany(id);
    }

    @GetMapping("/list")
    public ResponseData getAllCompanies() {
        return pharmaCompanyService.getAllCompanies();
    }
}
