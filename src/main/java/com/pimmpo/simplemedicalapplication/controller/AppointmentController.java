package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.AppointmentAddRequest;
import com.pimmpo.simplemedicalapplication.service.AppointmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Api для взаимодействия приема пациента")
@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping("/appointment")
    @Operation(summary = "Создание нового приема врача")
    public void addAppointment(@RequestBody AppointmentAddRequest request) {
        appointmentService.addAppointment(request);
    }
}
