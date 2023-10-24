package com.company.professions;
public class Driver extends Person {
    private String experiance;

    public Driver(String fullName, int age, String experiance) {
        super(fullName, age);
        this.experiance = experiance;
    }
    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public int getAge() {
        return age;
    }
    public String getExperiance() {
        return experiance;
    }
    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
}
