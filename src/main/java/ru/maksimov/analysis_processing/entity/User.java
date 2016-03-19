package ru.maksimov.analysis_processing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by maksimov on 19/03/2016.
 */
@Entity
public class User {

    @Id
    private int id;

    private String login;

    private String passsword;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasssword() {
        return passsword;
    }
}
