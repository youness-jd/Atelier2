package com.example.test_jpa_patient.repositories;

import com.example.test_jpa_patient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
Patient findByNom(String name);
}
