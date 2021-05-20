package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private static final String DATA_NOT_AVAILABLE = "Data not available";
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {

        String nameValue;
        if (this.name == null || this.name.equals("")) {
            nameValue = DATA_NOT_AVAILABLE;
        } else {
            nameValue = this.name;
        }

        String employerValue;
        if (this.employer == null || this.employer.getValue() == null || this.employer.getValue().equals("")) {
            employerValue = DATA_NOT_AVAILABLE;
        } else {
            employerValue = this.employer.getValue();
        }

        String locationValue;
        if (this.location == null || this.location.getValue() == null || this.location.getValue().equals("")) {
            locationValue = DATA_NOT_AVAILABLE;
        } else {
            locationValue = this.location.getValue();
        }

        String positionValue;
        if (this.positionType == null || this.positionType.getValue() == null || this.positionType.getValue().equals("")) {
            positionValue = DATA_NOT_AVAILABLE;
        } else {
            positionValue = this.positionType.getValue();
        }

        String competencyValue;
        if (this.coreCompetency == null || this.coreCompetency.getValue() == null || this.coreCompetency.getValue().equals("")) {
            competencyValue = DATA_NOT_AVAILABLE;
        } else {
            competencyValue = this.coreCompetency.getValue();
        }

        return String.format("\n" +
                "ID: %s\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", this.id, nameValue,  employerValue, locationValue, positionValue,
                competencyValue);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}