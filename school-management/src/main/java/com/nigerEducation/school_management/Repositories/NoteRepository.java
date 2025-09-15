package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Eleve;
import com.nigerEducation.school_management.Entities.Matieres;
import com.nigerEducation.school_management.Entities.Note;
import com.nigerEducation.school_management.Entities.TypeEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByEleve(Eleve eleve);
    List<Note> findByEleveAndMatiere(Eleve eleve, Matieres matiere);
    List<Note> findByTypeEvaluation(TypeEvaluation typeEvaluation);
    List<Note> findByDateEvaluationBetween(LocalDate debut, LocalDate fin);

    @Query("SELECT n FROM Note n WHERE n.eleve.classe.id = :classeId")
    List<Note> findByClasseId(@Param("classeId") Long classeId);
}

