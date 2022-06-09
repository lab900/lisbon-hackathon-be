package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@DiscriminatorValue("VIDEO")
@Entity
public class VideoContent extends Content {
    private String link;
    private boolean isScrollable;
}
