package com.nigerEducation.school_management.Entities;


import javax.persistence.*;

@Entity
@Table(name = "matieres")
public class Matieres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String description;
    private int coefficient = 1;

    // Constructeurs, getters et setters
    public Matieres() {}

    public Matieres(String nom, int coefficient) {
        this.nom = nom;
        this.coefficient = coefficient;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getCoefficient() { return coefficient; }
    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }
}