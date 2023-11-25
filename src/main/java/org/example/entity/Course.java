package org.example.entity;

public class Course {
    Integer id;
    String name;
    String description;
    Integer creditsNumber;
    Integer version;

    public Course(Integer id, String name, String description, Integer creditsNumber, Integer version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creditsNumber = creditsNumber;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreditsNumber() {
        return creditsNumber;
    }

    public void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creditsNumber=" + creditsNumber +
                ", version=" + version +
                '}';
    }
}
