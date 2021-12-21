package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.DoctorAddRequest;
import com.pimmpo.simplemedicalapplication.model.Doctor;
import com.pimmpo.simplemedicalapplication.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    private final SpecialityService specialityService;
    private final DepartmentService departmentService;

    public void addDoctor(DoctorAddRequest request) {
        Doctor doctor = new Doctor();
        doctor.setName(request.getName());
        doctor.setSurname(request.getSurname());
        doctor.setBirthday(request.getBirthday());
        doctor.setDepartment(departmentService.getById(request.getDepartmentId()));
        doctor.setSpecialities(specialityService.getById(request.getSpecialityId()));

        doctorRepository.save(doctor);
    }

    public void deleteDoctor(long id) {
        doctorRepository.deleteById(id);
    }
}
