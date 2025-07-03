package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.PatientEvaluation;
import com.showproject.hospital.service.PatientEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/evaluation")
public class PatientEvaluationController {
    @Autowired
    private PatientEvaluationService service;

    // 1. 提交评价
    @PostMapping("/submit")
    public int submit(@RequestBody PatientEvaluation eval) {
        return service.submitEvaluation(eval);
    }

    // 2. 查看评价（按医生/患者/全部）
    @GetMapping("/doctor/{doctorId}")
    public List<PatientEvaluation> getByDoctor(@PathVariable Integer doctorId) {
        return service.getEvaluationsByDoctor(doctorId);
    }
    @GetMapping("/patient/{patientId}")
    public List<PatientEvaluation> getByPatient(@PathVariable Integer patientId) {
        return service.getEvaluationsByPatient(patientId);
    }
    @GetMapping("/all")
    public List<PatientEvaluation> getAll() {
        return service.getAllEvaluations();
    }

    // 3. 回复评价
    @PostMapping("/reply")
    public int reply(@RequestParam Integer evalId, @RequestParam String reply) {
        return service.replyEvaluation(evalId, reply);
    }

    // 4. 恢复评价（state=1）
    @PostMapping("/recover")
    public int recover(@RequestParam Integer evalId) {
        return service.recoverEvaluation(evalId);
    }

    // 5. 统计分析
    @GetMapping("/stats/{doctorId}")
    public Map<String, Object> stats(@PathVariable Integer doctorId) {
        return service.getDoctorEvalStats(doctorId);
    }
}