package com.showproject.hospital.service;

import com.showproject.hospital.pojo.PharmaPolicy;
import com.showproject.hospital.utils.ResponseData;

public interface PharmaPolicyService {
    ResponseData addPolicy(PharmaPolicy policy);
    ResponseData updatePolicy(PharmaPolicy policy);
    ResponseData deletePolicy(Integer policyId);
    ResponseData getPolicy(Integer policyId);
    ResponseData getPoliciesByCompany(Integer companyId);
}
