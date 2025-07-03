package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.PharmaPolicy;
import com.showproject.hospital.service.PharmaPolicyService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmaPolicy")
public class PharmaPolicyController {
    @Autowired
    private PharmaPolicyService pharmaPolicyService;

    @PostMapping("/add")
    public ResponseData addPolicy(@RequestBody PharmaPolicy policy) {
        return pharmaPolicyService.addPolicy(policy);
    }

    @PostMapping("/update")
    public ResponseData updatePolicy(@RequestBody PharmaPolicy policy) {
        return pharmaPolicyService.updatePolicy(policy);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseData deletePolicy(@PathVariable Integer id) {
        return pharmaPolicyService.deletePolicy(id);
    }

    @GetMapping("/get/{id}")
    public ResponseData getPolicy(@PathVariable Integer id) {
        return pharmaPolicyService.getPolicy(id);
    }

    @GetMapping("/list/{companyId}")
    public ResponseData getPoliciesByCompany(@PathVariable Integer companyId) {
        return pharmaPolicyService.getPoliciesByCompany(companyId);
    }
}
