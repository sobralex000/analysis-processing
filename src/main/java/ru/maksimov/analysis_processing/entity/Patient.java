package ru.maksimov.analysis_processing.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by maksimov on 19/03/2016.
 */
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;

    private String middlename;

    private String lastname;

    private String address;

    private Date birthday;

    @OneToMany(mappedBy = "patient")
    private Set<Analysis> analyses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Set<Analysis> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(Set<Analysis> analyses) {
        this.analyses = analyses;
    }
}
