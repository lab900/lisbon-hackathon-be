package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Transition {
    @Id
    private Long id;
    private int scroll;
    @Embedded
    private Position startPosition;
    @Embedded
    private Position endPosition;
    private String animationIn;
    private String animationOut;
}
