package com.nigerEducation.school_management.Entities;

public enum TypeEvaluation {
    DEVOIR("Devoir"),
    COMPOSITION("Composition"),
    INTERROGATION("Interrogation"),
    EXAMEN("Examen");

    private final String libelle;

    TypeEvaluation(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }
}
