package ru.maksimov.analysis_processing.entity;

import javax.persistence.*;

/**
 * Created by maksimov on 19/03/2016.
 */
@Entity
public class Reagent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
