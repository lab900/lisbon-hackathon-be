package com.lab900.intrct.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transition {
    @Id
    private Long id;
    private int scroll;
    private int x;
    private int y;
    private String animationIn;
    private String animationOut;

    public int getScroll() {
        return scroll;
    }

    public void setScroll(int scroll) {
        this.scroll = scroll;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getAnimationIn() {
        return animationIn;
    }

    public void setAnimationIn(String animationIn) {
        this.animationIn = animationIn;
    }

    public String getAnimationOut() {
        return animationOut;
    }

    public void setAnimationOut(String animationOut) {
        this.animationOut = animationOut;
    }
}
