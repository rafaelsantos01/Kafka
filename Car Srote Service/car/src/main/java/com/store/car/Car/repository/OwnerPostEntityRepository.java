package com.store.car.Car.repository;

import com.store.car.Car.entity.OwnerPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerPostEntityRepository extends JpaRepository<OwnerPostEntity, Long> {
}