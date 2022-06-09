package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
public class Layer {
    @Id
    private Long id;
    private String name;
    @OneToOne
    private Content content;
    private boolean showInMenu;

    @OneToMany
    private List<Transition> transition;
    @OneToMany
    private List<Layer> subLayers;

}
