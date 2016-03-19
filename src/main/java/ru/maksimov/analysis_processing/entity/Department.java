package ru.maksimov.analysis_processing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by maksimov on 19/03/2016.
 */
@Entity
public class Department {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Analysis> analyses;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Analysis> getAnalyses() {
        return analyses;
    }
}
