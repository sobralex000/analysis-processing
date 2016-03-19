package ru.maksimov.analysis_processing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by maksimov on 19/03/2016.
 */
@Entity
@Table(name = "survey_type")
public class SurveyType {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "surveyType")
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
