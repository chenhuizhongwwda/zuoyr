package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.PatientEvaluationMapper;
import com.showproject.hospital.pojo.PatientEvaluation;
import com.showproject.hospital.service.PatientEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PatientEvaluationServiceImpl implements PatientEvaluationService {

    @Autowired
    private PatientEvaluationMapper patientEvaluationMapper;

    @Override
    public int submitEvaluation(PatientEvaluation eval) {
        return patientEvaluationMapper.insertEvaluation(eval);
    }

    @Override
    public List<PatientEvaluation> getEvaluationsByDoctor(Integer doctorId) {
        return patientEvaluationMapper.selectEvaluationsByDoctor(doctorId);
    }

    @Override
    public List<PatientEvaluation> getEvaluationsByPatient(Integer patientId) {
        return patientEvaluationMapper.selectEvaluationsByPatient(patientId);
    }

    @Override
    public List<PatientEvaluation> getAllEvaluations() {
        return patientEvaluationMapper.selectAllEvaluations();
    }

    @Override
    public int replyEvaluation(Integer evalId, String reply) {
        return patientEvaluationMapper.updateReply(evalId, reply, new Date());
    }

    @Override
    public int recoverEvaluation(Integer evalId) {
        return patientEvaluationMapper.updateState(evalId, 1);
    }

    @Override
    public Map<String, Object> getDoctorEvalStats(Integer doctorId) {
        return patientEvaluationMapper.getDoctorEvalStats(doctorId);
    }
}