package com.pimmpo.simplemedicalapplication.repository;

import com.pimmpo.simplemedicalapplication.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
