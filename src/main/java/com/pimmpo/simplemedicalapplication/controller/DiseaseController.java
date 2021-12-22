package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.DiseaseAddRequest;
import com.pimmpo.simplemedicalapplication.model.Disease;
import com.pimmpo.simplemedicalapplication.service.DiseaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Api для взаимодействия с болезнями")
@RestController
@RequiredArgsConstructor
public class DiseaseController {

    private final DiseaseService diseaseService;

    @PostMapping("/disease")
    @Operation(summary = "Создание новой болезние")
    public void addDisease(@RequestBody DiseaseAddRequest request) {
        diseaseService.addDisease(request);
    }

    @DeleteMapping("/disease/{id}")
    @Operation(summary = "Удаление болезние")
    public void deleteDisease(@PathVariable long id) {
        diseaseService.deleteDisease(id);
    }

    @GetMapping("/disease/{id}")
    @Operation(summary = "Получение болезние по id")
    public Disease getById(@PathVariable long id) {
        return diseaseService.getById(id);
    }
}
