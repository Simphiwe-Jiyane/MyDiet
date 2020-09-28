package com.example.mydiet;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String surname;
    private String username;
    private int age;
    private double height;
    private double weight;
    private double targetWeight;
    private Boolean isImeperial;
    private String TargetReason;
    private double avgCalories;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Boolean getImeperial() {
        return isImeperial;
    }

    public void setImeperial(Boolean imeperial) {
        isImeperial = imeperial;
    }

    public double getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(double targetWeight) {
        this.targetWeight = targetWeight;
    }

    public String getTargetReason() {
        return TargetReason;
    }

    public void setTargetReason(String targetReason) {
        TargetReason = targetReason;
    }

    public double getAvgCalories() {
        return avgCalories;
    }

    public void setAvgCalories(double avgCalories) {
        this.avgCalories = avgCalories;
    }
}
