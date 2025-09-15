package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Matieres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepository extends JpaRepository<Matieres,Long> {

}
