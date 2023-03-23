package com.store.car.Car.repository;

import com.store.car.Car.entity.CarPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPostEntityRepository extends JpaRepository<CarPostEntity, Long> {
}