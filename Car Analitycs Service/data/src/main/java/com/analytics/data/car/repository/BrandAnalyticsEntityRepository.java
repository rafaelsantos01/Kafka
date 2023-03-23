package com.analytics.data.car.repository;

import com.analytics.data.car.entity.BrandAnalyticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandAnalyticsEntityRepository extends JpaRepository<BrandAnalyticsEntity, Long> {
    Optional<BrandAnalyticsEntity> findByBrand(String brand);
}