package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Eleve;
import com.nigerEducation.school_management.Entities.Presence;
import com.nigerEducation.school_management.Entities.StatutPresence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PresenceRepository extends JpaRepository<Presence, Long> {
    List<Presence> findByEleve(Eleve eleve);
    List<Presence> findByDateAndEleve(LocalDate date, Eleve eleve);
    List<Presence> findByDateBetween(LocalDate debut, LocalDate fin);
    List<Presence> findByStatut(StatutPresence statut);
    Optional<Presence> findByEleveAndDate(Eleve eleve, LocalDate date);

    @Query("SELECT p FROM Presence p WHERE p.eleve.classe.id = :classeId AND p.date = :date")
    List<Presence> findByClasseIdAndDate(@Param("classeId") Long classeId, @Param("date") LocalDate date);

}
