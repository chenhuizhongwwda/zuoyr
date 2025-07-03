package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.PharmaCompanyMapper;
import com.showproject.hospital.pojo.PharmaCompany;
import com.showproject.hospital.service.PharmaCompanyService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmaCompanyServiceImpl implements PharmaCompanyService {
    @Autowired
    private PharmaCompanyMapper mapper;

    @Override
    public ResponseData addCompany(PharmaCompany company) {
        mapper.insertCompany(company);
        return ResponseData.success("添加成功");
    }

    @Override
    public ResponseData updateCompany(PharmaCompany company) {
        mapper.updateCompany(company);
        return ResponseData.success("修改成功");
    }

    @Override
    public ResponseData deleteCompany(Integer companyId) {
        mapper.deleteCompany(companyId);
        return ResponseData.success("删除成功");
    }

    @Override
    public ResponseData getCompany(Integer companyId) {
        return ResponseData.success(mapper.selectCompanyById(companyId));
    }

    @Override
    public ResponseData getAllCompanies() {
        return ResponseData.success(mapper.selectAllCompanies());
    }
}
