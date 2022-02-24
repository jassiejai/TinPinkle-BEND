package com.magic.tinpinkle.service;


import com.magic.tinpinkle.model.Animal;
import com.magic.tinpinkle.model.Plant;
import com.magic.tinpinkle.repository.AnimalRepository;
import com.magic.tinpinkle.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    private PlantRepository plantRepository;

    @Autowired
    public void setPlantRepository(PlantRepository plantRepository){
        this.plantRepository = plantRepository;
    }

    public List<Plant> getAllPlants(){
        return plantRepository.findAll();
    }


    public Plant createPlant(Plant plantObject) {

        Plant create = plantRepository.findByName(plantObject.getName());

        return plantRepository.save(create);
    }

    public Optional<Plant> getPlants(Long plantId) {
        Optional<Plant> plant = plantRepository.findById(plantId);

        return plant;
    }

    public Plant updatePlants(Long plantId, Plant plantObject) {

        Plant plant = plantRepository.findById(plantId).get();

        plant.setName(plantObject.getName());
        plant.setDescription(plantObject.getDescription());
        plant.setFlower(plantObject.getFlower());
        plant.setRoot(plantObject.getRoot());
        plant.setStem(plantObject.getStem());
        return plantRepository.save(plant);
    }

    public Plant deletePlant(Long plantId) {
        Plant plant = plantRepository.findById(plantId).get();

        return plant;

    }
}
