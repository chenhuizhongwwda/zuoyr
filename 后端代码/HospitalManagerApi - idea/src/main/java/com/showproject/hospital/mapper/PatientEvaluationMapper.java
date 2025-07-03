package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.PatientEvaluation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date; // 修复：添加缺失的导入
import java.util.List;
import java.util.Map;

@Mapper
public interface PatientEvaluationMapper {
    int insertEvaluation(PatientEvaluation eval);
    List<PatientEvaluation> selectEvaluationsByDoctor(Integer doctorId);
    List<PatientEvaluation> selectEvaluationsByPatient(Integer patientId);
    List<PatientEvaluation> selectAllEvaluations();

    // 更新医生回复内容和时间
    int updateReply(@Param("evalId") Integer evalId, @Param("reply") String reply, @Param("replyTime") Date replyTime);

    int updateState(@Param("evalId") Integer evalId, @Param("state") Integer state);
    Map<String, Object> getDoctorEvalStats(Integer doctorId); // 统计分析
}
