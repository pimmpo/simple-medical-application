package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.SpecialityAddRequest;
import com.pimmpo.simplemedicalapplication.model.Speciality;
import com.pimmpo.simplemedicalapplication.repository.SpecialityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialityService {

    private final SpecialityRepository specialityRepository;

    public void addSpeciality(SpecialityAddRequest request) {
        Speciality speciality = new Speciality();
        speciality.setName(request.getName());
        specialityRepository.save(speciality);
    }

    public void deleteSpeciality(long id) {
        specialityRepository.deleteById(id);
    }

    public Speciality getById(long id) {
        return specialityRepository.findById(id).get();
    }
}
