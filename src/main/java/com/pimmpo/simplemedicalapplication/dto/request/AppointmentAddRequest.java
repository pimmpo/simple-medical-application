package com.pimmpo.simplemedicalapplication.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AppointmentAddRequest {
    private long doctorId;
    private long patientId;
    private long diseaseId;
    private LocalDate date;
}
