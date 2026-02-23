package com.deepak.url_shortener.repository;

import com.deepak.url_shortener.entity.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<UrlMapping, Long> {
}
