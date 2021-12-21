package com.pimmpo.simplemedicalapplication.repository;

import com.pimmpo.simplemedicalapplication.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
