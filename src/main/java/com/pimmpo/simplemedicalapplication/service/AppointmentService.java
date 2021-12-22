package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.AppointmentAddRequest;
import com.pimmpo.simplemedicalapplication.model.Appointment;
import com.pimmpo.simplemedicalapplication.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    private final DoctorService doctorService;
    private final PatientService patientService;
    private final DiseaseService diseaseService;

    public void addAppointment(AppointmentAddRequest request) {
        Appointment appointment = new Appointment();
        appointment.setDate(LocalDate.now());
        appointment.setDoctor(doctorService.getById(request.getDoctorId()));
        appointment.setPatient(patientService.getById(request.getPatientId()));
        appointment.setDisease(diseaseService.getById(request.getDiseaseId()));

        appointmentRepository.save(appointment);
    }

}
