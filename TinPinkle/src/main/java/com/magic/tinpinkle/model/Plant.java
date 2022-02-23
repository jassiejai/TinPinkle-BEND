package com.magic.tinpinkle.model;


import javax.persistence.*;

@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String name;

    private String description;

    private Boolean flower;

    private Boolean stem;

    private Boolean root;

    public Plant() {
    }

    public Plant(Long id, String name, String description, Boolean flower, Boolean stem, Boolean root) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.flower = flower;
        this.stem = stem;
        this.root = root;
    }

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

    public Boolean getFlower() {
        return flower;
    }

    public void setFlower(Boolean flower) {
        this.flower = flower;
    }

    public Boolean getStem() {
        return stem;
    }

    public void setStem(Boolean stem) {
        this.stem = stem;
    }

    public Boolean getRoot() {
        return root;
    }

    public void setRoot(Boolean root) {
        this.root = root;
    }
}
