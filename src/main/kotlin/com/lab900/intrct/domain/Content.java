package com.lab900.intrct.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Content {
    @Id
    private Long id;
}
