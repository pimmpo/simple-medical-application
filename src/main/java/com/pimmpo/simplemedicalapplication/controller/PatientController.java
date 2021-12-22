package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.PatientAddRequest;
import com.pimmpo.simplemedicalapplication.model.Patient;
import com.pimmpo.simplemedicalapplication.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Api для взаимодействия с пациентами")
@RestController
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping("/patient")
    @Operation(summary = "Добавление нового пациента")
    public void addPatient(@RequestBody PatientAddRequest request) {
        patientService.addPatient(request);
    }

    @DeleteMapping("/patient/{id}")
    @Operation(summary = "Удаление пациента")
    public void deletePatient(@PathVariable long id) {
        patientService.deletePatient(id);
    }

    @GetMapping("/patient/{id}")
    @Operation(summary = "Получение пациента по id")
    public Patient getById(@PathVariable long id) {
        return patientService.getById(id);
    }
}
