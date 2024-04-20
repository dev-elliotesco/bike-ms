package com.develliotesco.bikems.controller;

import com.develliotesco.bikems.entity.Bike;
import com.develliotesco.bikems.service.BikeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bikes")
@AllArgsConstructor
public class BikeController {

    private final BikeService bikeService;

    @GetMapping
    public ResponseEntity<List<Bike>> getAll() {
        List<Bike> bikes = bikeService.getAll();
        return ResponseEntity.ok(bikes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bike> getById(@PathVariable int id) {
        Bike bike = bikeService.getById(id);
        return ResponseEntity.ok(bike);
    }

    @GetMapping("/byuser/{userId}")
    public ResponseEntity<List<Bike>> getByUserId(@PathVariable int userId) {
        List<Bike> bikes = bikeService.getByUserId(userId);
        return ResponseEntity.ok(bikes);
    }

    @PostMapping
    public ResponseEntity<Bike> save(@RequestBody Bike bike) {
        Bike savedBike = bikeService.save(bike);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBike);
    }
}
