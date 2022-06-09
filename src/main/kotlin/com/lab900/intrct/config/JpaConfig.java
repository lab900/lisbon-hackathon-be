package com.lab900.intrct.config;

import com.lab900.intrct.domain.Layer;
import com.lab900.intrct.domain.repository.TimelineConfigJpaRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = Layer.class)
@EnableJpaRepositories(basePackageClasses = TimelineConfigJpaRepository.class)
public class JpaConfig {
}
