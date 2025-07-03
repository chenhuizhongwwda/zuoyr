package com.showproject.hospital.service;

import com.showproject.hospital.pojo.PatientEvaluation;

import java.util.List;
import java.util.Map;

public interface PatientEvaluationService {
    int submitEvaluation(PatientEvaluation eval);
    List<PatientEvaluation> getEvaluationsByDoctor(Integer doctorId);
    List<PatientEvaluation> getEvaluationsByPatient(Integer patientId);
    List<PatientEvaluation> getAllEvaluations();
    int replyEvaluation(Integer evalId, String reply);
    int recoverEvaluation(Integer evalId);
    Map<String, Object> getDoctorEvalStats(Integer doctorId);
}