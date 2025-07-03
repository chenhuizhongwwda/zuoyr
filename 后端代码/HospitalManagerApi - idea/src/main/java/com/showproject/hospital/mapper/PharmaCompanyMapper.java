package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.PharmaCompany;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PharmaCompanyMapper {
    @Insert("INSERT INTO pharma_company (company_name, address, contact, phone, email) VALUES (#{companyName}, #{address}, #{contact}, #{phone}, #{email})")
    int insertCompany(PharmaCompany company);

    @Update("UPDATE pharma_company SET company_name=#{companyName}, address=#{address}, contact=#{contact}, phone=#{phone}, email=#{email} WHERE company_id=#{companyId}")
    int updateCompany(PharmaCompany company);

    @Delete("DELETE FROM pharma_company WHERE company_id=#{companyId}")
    int deleteCompany(Integer companyId);

    @Select("SELECT company_id as companyId, company_name as companyName, address, contact, phone, email FROM pharma_company WHERE company_id=#{companyId}")
    PharmaCompany selectCompanyById(Integer companyId);

    @Select("SELECT company_id as companyId, company_name as companyName, address, contact, phone, email FROM pharma_company")
    List<PharmaCompany> selectAllCompanies();
}
