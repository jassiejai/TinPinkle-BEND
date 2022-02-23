package com.magic.tinpinkle.service;


import com.magic.tinpinkle.model.Plant;
import com.magic.tinpinkle.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
