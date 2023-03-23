package com.analytics.data.car.repository;

import com.analytics.data.car.entity.CarModelAnalyticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarModelAnalyticsEntityRepository extends JpaRepository<CarModelAnalyticsEntity, Long> {
    Optional<CarModelAnalyticsEntity> findByModel(String model);
}
