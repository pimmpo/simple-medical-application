package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.DoctorAddRequest;
import com.pimmpo.simplemedicalapplication.service.DoctorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Api для взаимодействия сущностями доктор")
@RestController
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping("/doctor")
    @Operation(summary = "Добавление нового доктора")
    public void addDoctor(@RequestBody DoctorAddRequest request) {
        doctorService.addDoctor(request);
    }

    @DeleteMapping("/doctor/{id}")
    @Operation(summary = "Удаление доктора")
    public void deleteDoctor(@PathVariable long id) {
        doctorService.deleteDoctor(id);
    }
}
