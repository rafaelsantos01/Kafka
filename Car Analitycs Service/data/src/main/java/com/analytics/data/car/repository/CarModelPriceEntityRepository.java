package com.analytics.data.car.repository;

import com.analytics.data.car.entity.CarModelPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelPriceEntityRepository extends JpaRepository<CarModelPriceEntity, Long> {
}