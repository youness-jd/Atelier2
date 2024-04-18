package com.example.test_jpa_patient.repositories;

import com.example.test_jpa_patient.entities.Patient;
import com.example.test_jpa_patient.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
