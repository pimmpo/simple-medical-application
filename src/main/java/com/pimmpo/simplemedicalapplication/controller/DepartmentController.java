package com.pimmpo.simplemedicalapplication.controller;

import com.pimmpo.simplemedicalapplication.dto.request.DepartmentAddRequest;
import com.pimmpo.simplemedicalapplication.model.Department;
import com.pimmpo.simplemedicalapplication.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/department")
    @Operation(summary = "Добавить отделение")
    public void addDepartment(@RequestBody DepartmentAddRequest request) {
        departmentService.addDepartment(request);
    }

    @DeleteMapping("/department/{id}")
    @Operation(summary = "Удалить отделение")
    public void deleteDepartment(@PathVariable long id) {
        departmentService.deleteDepartment(id);
    }

    @GetMapping("/department/{id}")
    @Operation(summary = "Получение отделение по id")
    public Department getById(@PathVariable("id") long id) {
        return departmentService.getById(id);
    }
}
