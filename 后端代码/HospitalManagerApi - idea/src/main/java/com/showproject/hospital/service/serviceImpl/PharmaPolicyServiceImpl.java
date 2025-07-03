package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.PharmaPolicyMapper;
import com.showproject.hospital.pojo.PharmaPolicy;
import com.showproject.hospital.service.PharmaPolicyService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmaPolicyServiceImpl implements PharmaPolicyService {
    @Autowired
    private PharmaPolicyMapper mapper;

    @Override
    public ResponseData addPolicy(PharmaPolicy policy) {
        mapper.insertPolicy(policy);
        return ResponseData.success("添加成功");
    }

    @Override
    public ResponseData updatePolicy(PharmaPolicy policy) {
        mapper.updatePolicy(policy);
        return ResponseData.success("修改成功");
    }

    @Override
    public ResponseData deletePolicy(Integer policyId) {
        mapper.deletePolicy(policyId);
        return ResponseData.success("删除成功");
    }

    @Override
    public ResponseData getPolicy(Integer policyId) {
        return ResponseData.success(mapper.selectPolicyById(policyId));
    }

    @Override
    public ResponseData getPoliciesByCompany(Integer companyId) {
        // 这里直接返回List，不要转字符串
        return ResponseData.success(mapper.selectPoliciesByCompanyId(companyId));
    }
}
