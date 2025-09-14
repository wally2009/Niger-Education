package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Classe;
import com.nigerEducation.school_management.Entities.Eleve;
import com.nigerEducation.school_management.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {
    Optional<Eleve> findByNumeroMatricule(String numeroMatricule);
    List<Eleve> findByUtilisateur(Utilisateur parent);
    List<Eleve> findByClasse(Classe classe);
    List<Eleve> findByActifTrue();
}
