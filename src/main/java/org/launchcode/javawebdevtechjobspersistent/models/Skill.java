package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 3000, message = "Description should be less than 3000 characters.")
    private String skillDescription;

    public Skill() {}

    public String getSkillDescription() { return skillDescription; }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
}