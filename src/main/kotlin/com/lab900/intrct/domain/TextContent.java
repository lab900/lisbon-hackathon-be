package com.lab900.intrct.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@DiscriminatorValue("TEXT")
@Entity
public class TextContent extends Content {
    private String textValue;
}
