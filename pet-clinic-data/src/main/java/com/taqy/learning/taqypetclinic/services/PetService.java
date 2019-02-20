package com.taqy.learning.taqypetclinic.services;

import com.taqy.learning.taqypetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
