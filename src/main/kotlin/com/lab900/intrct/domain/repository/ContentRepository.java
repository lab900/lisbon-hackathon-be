package com.lab900.intrct.domain.repository;

import com.lab900.intrct.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
