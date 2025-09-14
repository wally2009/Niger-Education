package com.nigerEducation.school_management.Entities;

public enum StatutPresence {
    PRESENT("Présent"),
    ABSENT("Absent"),
    RETARD("Retard"),
    ABSENT_JUSTIFIE("Absent Justifié");

    private final String libelle;

    StatutPresence(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }
}