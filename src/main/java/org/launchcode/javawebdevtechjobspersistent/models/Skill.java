package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 300, message = "Description should be less than 3000 characters.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    //no arg constructor
    public Skill() {}

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    //getter
    public List<Job> getJobs() {
        return jobs;
    }

//    Do we need to be able to add jobs?
    public void addJob(Job job) {
        this.jobs.add(job);
    }
}