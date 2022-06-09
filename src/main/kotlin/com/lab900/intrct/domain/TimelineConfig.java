package com.lab900.intrct.domain;


import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TimelineConfig {
    @Id
    private Long id;
    @NotNull
    private String name;
    @OneToMany
    private Set<Layer> layers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Layer> getLayers() {
        return layers;
    }

    public void setLayers(Set<Layer> layers) {
        this.layers = layers;
    }
}
