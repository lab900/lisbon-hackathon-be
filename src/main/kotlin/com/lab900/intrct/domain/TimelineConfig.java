package com.lab900.intrct.domain;


import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Setter
@Getter
@Entity
public class TimelineConfig {
    @Id
    private Long id;
    @NotNull
    private String name;
    @OneToMany
    private Set<Layer> layers;
}
