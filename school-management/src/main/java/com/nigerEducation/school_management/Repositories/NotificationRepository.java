package com.nigerEducation.school_management.Repositories;

import com.nigerEducation.school_management.Entities.Notification;
import com.nigerEducation.school_management.Entities.TypeNotification;
import com.nigerEducation.school_management.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByDestinataire(Utilisateur destinataire);
    List<Notification> findByDestinataireAndLueFalse(Utilisateur destinataire);
    List<Notification> findByType(TypeNotification type);
    List<Notification> findByDestinataireOrderByDateEnvoiDesc(Utilisateur destinataire);
}
