package com.pimmpo.simplemedicalapplication.repository;

import com.pimmpo.simplemedicalapplication.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
