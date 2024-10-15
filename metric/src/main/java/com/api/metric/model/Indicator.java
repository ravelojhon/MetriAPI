package com.api.metric.model;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indicatorID;
    private String name;
    private String type;
    private String description;
    private double goal;
    private double minimum;
    private double maximum;
}

