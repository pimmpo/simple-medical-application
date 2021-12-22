package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.DiseaseAddRequest;
import com.pimmpo.simplemedicalapplication.model.Disease;
import com.pimmpo.simplemedicalapplication.repository.DiseaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiseaseService {

    private final DiseaseRepository diseaseRepository;

    public void addDisease(DiseaseAddRequest request) {
        Disease disease = new Disease();
        disease.setName(request.getName());
        diseaseRepository.save(disease);
    }

    public void deleteDisease(long id) {
        diseaseRepository.deleteById(id);
    }

    public Disease getById(long id) {
        return diseaseRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Заболеваниен не найдено"));
    }
}
