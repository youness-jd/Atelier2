package com.example.test_jpa_patient.service;

import com.example.test_jpa_patient.entities.Consultation;
import com.example.test_jpa_patient.entities.Patient;
import com.example.test_jpa_patient.entities.Medecin;
import com.example.test_jpa_patient.entities.RendezVous;

public interface IHospitalService {
     Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
