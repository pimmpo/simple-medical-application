package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.PatientAddRequest;
import com.pimmpo.simplemedicalapplication.model.Patient;
import com.pimmpo.simplemedicalapplication.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public void addPatient(PatientAddRequest request) {
        Patient patient = new Patient();
        patient.setName(request.getName());
        patient.setSurname(request.getSurname());
        patient.setPhoneNumber(request.getPhoneNumber());
        patient.setBirthday(request.getBirthday());

        patientRepository.save(patient);
    }

    public void deletePatient(long id) {
        patientRepository.deleteById(id);
    }

    public Patient getById(long id) {
        return patientRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Пациент не найден"));
    }
}
