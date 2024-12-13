package com.web.dto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProjectDTO {

    private Long id;
    private String title;
    private String description;
    private int goal;
    private int currentFunding;
    private LocalDate startDate;
    private LocalDate endDate;
    private String imagePath;
    private String createdBy;

    public ProjectDTO() {}

    public ProjectDTO(Long id, String title, String description, int goal, int currentFunding, LocalDate startDate, LocalDate endDate, String imagePath, String createdBy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.goal = goal;
        this.currentFunding = currentFunding;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imagePath = imagePath;
        this.createdBy = createdBy;
    }
    
 // Getter and Setter for createdBy
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getCurrentFunding() {
        return currentFunding;
    }

    public void setCurrentFunding(int currentFunding) {
        this.currentFunding = currentFunding;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public long getDaysLeft() {
        return ChronoUnit.DAYS.between(LocalDate.now(), endDate);
    }
}