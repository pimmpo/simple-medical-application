package com.pimmpo.simplemedicalapplication.repository;

import com.pimmpo.simplemedicalapplication.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
