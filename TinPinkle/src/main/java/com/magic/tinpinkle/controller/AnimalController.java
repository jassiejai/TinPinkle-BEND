package com.magic.tinpinkle.controller;


import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public void setAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }
    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody Animal animalObject){
        return animalService.createAnimal(animalObject);
    }
}
