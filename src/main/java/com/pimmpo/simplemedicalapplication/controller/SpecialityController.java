package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.SpecialityAddRequest;
import com.pimmpo.simplemedicalapplication.model.Speciality;
import com.pimmpo.simplemedicalapplication.service.SpecialityService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
public class SpecialityController {

    private final SpecialityService specialityService;

    @PostMapping("/speciality")
    @Operation(summary = "Добавить новую специальность")
    public void addSpeciality(@RequestBody SpecialityAddRequest request) {
        specialityService.addSpeciality(request);
    }

    @DeleteMapping("/speciality/{id}")
    @Operation(summary = "Удалить специальность")
    public void deleteSpeciality(@PathParam("id") long id) {

    }
}
