package com.example.mydiet;

import java.io.Serializable;

public class User implements Serializable {

    //TODO: Integrate user age

    private String firstName;
    private String surname;
    private String username;
    private String email;
    private String password;
    private double height;
    private double weight;
    private double targetWeight;
    private Boolean isImeperial;
    private String TargetReason;
    private double avgCalories;

    //Getters and setters
    //#region
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //#endregion
}
