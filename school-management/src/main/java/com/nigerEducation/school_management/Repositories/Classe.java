package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Classe extends JpaRepository<Classe, Long> {
    List<Classe> findByEnseignantTitulaire(Utilisateur enseignant);
    List<Classe> findByNiveau(String niveau);
}
