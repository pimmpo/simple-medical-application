package com.pimmpo.simplemedicalapplication.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DoctorAddRequest {
    private String name;
    private String surname;
    private LocalDate birthday;
    private long specialityId;
    private long departmentId;

}
