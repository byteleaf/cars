package com.byteleaf.cars.boundary;

import com.byteleaf.cars.entity.CarEntity;
import com.byteleaf.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<CarEntity> getCars() {
        return this.carRepository.findAll();
    }

}
