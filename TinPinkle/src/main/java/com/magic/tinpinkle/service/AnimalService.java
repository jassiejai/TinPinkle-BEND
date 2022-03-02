package com.magic.tinpinkle.service;


import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.model.Plant;
import com.magic.tinpinkle.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public void setAnimalRepository(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }


    public Animal createAnimal(Animal animalObject) {

        return animalRepository.save(animalObject);
    }

    public Optional<Animal> getAnimal(Long animalId) {
        Optional<Animal> animal = animalRepository.findById(animalId);

        return animal;
    }

    public Animal updateAnimal(Long animalId, Animal animalObject) {

        Animal animal = animalRepository.findById(animalId).get();

        animal.setName(animalObject.getName());
        animal.setDescription(animalObject.getDescription());
        animal.setAnimalType(animalObject.getAnimalType());
        animal.setPower(animalObject.getPower());
        animal.setColor(animalObject.getColor());
        return animalRepository.save(animal);
    }

    public Animal deleteAnimal(Long animalId) {

        Animal dltAnimal = animalRepository.getById(animalId);

        animalRepository.delete(dltAnimal);

        return dltAnimal;
    }
}
