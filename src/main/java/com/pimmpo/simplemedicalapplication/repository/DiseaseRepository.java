package com.pimmpo.simplemedicalapplication.repository;

import com.pimmpo.simplemedicalapplication.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}
