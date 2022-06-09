package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Transition {
    @Id
    private Long id;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "x", column = @Column(name = "startX")),
            @AttributeOverride(name = "y", column = @Column(name = "startY")),
    })
    private Position startPosition;
    @AttributeOverrides({
            @AttributeOverride(name = "x", column = @Column(name = "endX")),
            @AttributeOverride(name = "y", column = @Column(name = "endY")),
    })
    @Embedded
    private Position endPosition;
    private String animationIn;
    private String animationOut;
}
