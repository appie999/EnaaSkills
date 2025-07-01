package com.enaa_skills.Entity;

import jakarta.persistence.*;

@Entity
public class SousCompetence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String description;
    private Boolean validated = false;


    @ManyToOne
    @JoinColumn(name = "competence_id")
    private Competence competence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public SousCompetence() {
    }

    public SousCompetence(Long id, String name, String description, Boolean validated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.validated = validated;
    }
}
