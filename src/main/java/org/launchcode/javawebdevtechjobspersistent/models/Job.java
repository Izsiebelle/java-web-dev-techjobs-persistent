package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    //Gets this info from Abstract
//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setSkills(List<Skill> skill) {
        this.skills = skill;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    //do i need????
    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }
}
