package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Position {
    private Long x;
    private Long y;
}
