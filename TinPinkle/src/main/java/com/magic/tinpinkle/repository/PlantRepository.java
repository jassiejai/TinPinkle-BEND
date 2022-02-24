package com.magic.tinpinkle.repository;

import com.magic.tinpinkle.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {

    Plant findByName(String name);
}
