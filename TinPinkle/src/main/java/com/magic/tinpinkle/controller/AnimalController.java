package com.magic.tinpinkle.controller;


import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/animal/{animalId}")
    public Optional<Animal> getAnimal(@PathVariable Long animalId){
        return animalService.getAnimal(animalId);
    }

    @PutMapping("/animal/{animalId}")
    public Animal updateAnimal(@PathVariable (value = "animamlId") Long animalId, @RequestBody Animal animalObject){
        return animalService.updateAnimal(animalId, animalObject);
    }
    @DeleteMapping("/animal/{animalId}")
    public Animal deleteAnimal(@PathVariable (value = "animamlId") Long animalId, @RequestBody Animal animalObject){
        return animalService.deleteAnimal(animalId);
    }
}
