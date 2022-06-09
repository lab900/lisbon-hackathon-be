package com.lab900.intrct.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Layer {
    @Id
    private Long id;
    private String name;
    private String content;
    private boolean showInMenu;

    @OneToOne
    private Transition transition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isShowInMenu() {
        return showInMenu;
    }

    public void setShowInMenu(boolean showInMenu) {
        this.showInMenu = showInMenu;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}
