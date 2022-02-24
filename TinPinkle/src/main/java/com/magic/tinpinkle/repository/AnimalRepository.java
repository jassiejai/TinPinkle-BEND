package com.magic.tinpinkle.repository;


import com.magic.tinpinkle.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal findByName(String name);
}
