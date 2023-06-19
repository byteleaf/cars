package com.byteleaf.cars.repository;

import com.byteleaf.cars.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
