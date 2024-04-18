package com.example.test_jpa_patient.repositories;

import com.example.test_jpa_patient.entities.Patient;
import com.example.test_jpa_patient.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
