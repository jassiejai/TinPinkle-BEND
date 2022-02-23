package com.magic.tinpinkle.service;


import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.repository.AnimalRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
