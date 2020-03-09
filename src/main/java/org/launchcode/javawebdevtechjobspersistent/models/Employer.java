package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> employers = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

}
