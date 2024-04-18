package com.example.test_jpa_patient.repositories;

import com.example.test_jpa_patient.entities.Consultation;
import com.example.test_jpa_patient.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String nom);
}
