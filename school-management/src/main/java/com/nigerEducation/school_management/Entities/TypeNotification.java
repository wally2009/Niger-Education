package com.nigerEducation.school_management.Entities;

public enum TypeNotification {
    PRESENCE("Présence"),
    NOTE("Note"),
    REUNION("Réunion"),
    EVENEMENT("Événement"),
    GENERALE("Générale");

    private final String libelle;

    TypeNotification(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }
}
