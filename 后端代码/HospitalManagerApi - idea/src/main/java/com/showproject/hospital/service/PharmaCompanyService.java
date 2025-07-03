package com.showproject.hospital.service;

import com.showproject.hospital.pojo.PharmaCompany;
import com.showproject.hospital.utils.ResponseData;

public interface PharmaCompanyService {
    ResponseData addCompany(PharmaCompany company);
    ResponseData updateCompany(PharmaCompany company);
    ResponseData deleteCompany(Integer companyId);
    ResponseData getCompany(Integer companyId);
    ResponseData getAllCompanies();
}
