package com.api.metric.controller;

import com.api.metric.model.Indicator;
import com.api.metric.repository.IndicatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.metric.exception.ResourceNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/indicator")
public class IndicatorController {

    private final IndicatorRepository indicatorRepository;

    @Autowired
    public IndicatorController(IndicatorRepository indicatorRepository) {
        this.indicatorRepository = indicatorRepository;
    }

    @GetMapping
    public List<Indicator> getAllIndicators() {
        return indicatorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Indicator getIndicatorById(@PathVariable Long id) {
        return indicatorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Indicator createUpdateIndicator(@RequestBody Indicator indicator) {
       return indicatorRepository.save(indicator);
    }

    @PutMapping("/{id}")
    public Indicator updateIndicator(@PathVariable Long id, @RequestBody Indicator indicatorBody) {
        return indicatorRepository.save(indicatorBody);
    }

    @DeleteMapping("/{id}")
    public void deleteIndicator(@PathVariable Long id) {
        indicatorRepository.deleteById(id);
    }
}

