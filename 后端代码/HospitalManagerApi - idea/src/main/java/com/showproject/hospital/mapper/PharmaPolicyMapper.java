package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.PharmaPolicy;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PharmaPolicyMapper {
    @Insert("INSERT INTO pharma_policy (company_id, policy_title, policy_content) VALUES (#{companyId}, #{policyTitle}, #{policyContent})")
    int insertPolicy(PharmaPolicy policy);

    @Update("UPDATE pharma_policy SET policy_title=#{policyTitle}, policy_content=#{policyContent} WHERE policy_id=#{policyId}")
    int updatePolicy(PharmaPolicy policy);

    @Delete("DELETE FROM pharma_policy WHERE policy_id=#{policyId}")
    int deletePolicy(Integer policyId);

    @Select("SELECT policy_id as policyId, company_id as companyId, policy_title as policyTitle, policy_content as policyContent, create_time as createTime FROM pharma_policy WHERE policy_id=#{policyId}")
    PharmaPolicy selectPolicyById(Integer policyId);

    @Select("SELECT policy_id as policyId, company_id as companyId, policy_title as policyTitle, policy_content as policyContent, create_time as createTime FROM pharma_policy WHERE company_id=#{companyId}")
    List<PharmaPolicy> selectPoliciesByCompanyId(Integer companyId);
}
