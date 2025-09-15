package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClasseRepository extends JpaRepository<ClasseRepository, Long> {
    List<ClasseRepository> findByEnseignantTitulaire(Utilisateur enseignant);
    List<ClasseRepository> findByNiveau(String niveau);
}
