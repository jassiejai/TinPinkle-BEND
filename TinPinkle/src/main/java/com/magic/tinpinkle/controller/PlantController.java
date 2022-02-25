package com.magic.tinpinkle.controller;

import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.model.Plant;
import com.magic.tinpinkle.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api")
public class PlantController {

    private PlantService plantService;

    @Autowired
    public void setPlantService(PlantService plantService) {
        this.plantService= plantService;
    }



    @GetMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @PostMapping("/plant")
    public Plant createPlants(@RequestBody Plant plantObject){
        return plantService.createPlant(plantObject);
    }

    @GetMapping("/plant/{plantId}")
    public Optional<Plant> getPlant(@PathVariable Long plantId){
        return plantService.getPlants(plantId);
    }

    @PutMapping("/plant/{plantId}")
    public Plant updatePlant(@PathVariable (value = "plantId") Long plantId, @RequestBody Plant plantObject){
        return plantService.updatePlants(plantId, plantObject);
    }
    @DeleteMapping("/plant/{plantId}")
    public Plant deletePlant(@PathVariable (value = "plantId") Long plantId, @RequestBody Plant plantObject){
        return plantService.deletePlant(plantId);
    }
}
