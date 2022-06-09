package com.lab900.intrct.domain.controller;

import com.lab900.intrct.domain.TimelineConfig;
import com.lab900.intrct.domain.repository.TimelineConfigJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TimelineConfigController {

    private final TimelineConfigJpaRepository repo;

    @GetMapping("/v1/config")
    public List<TimelineConfig> all() {
        return repo.findAll();
    }

    @GetMapping("/v1/config/{id}")
    public TimelineConfig one(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }


}
