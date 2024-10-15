package com.api.metric.model;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "indicator")
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indicatorid;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "goal")
    private double goal;

    @Column(name = "minimum")
    private double minimum;

    @Column(name = "maximum")
    private double maximum;
}

