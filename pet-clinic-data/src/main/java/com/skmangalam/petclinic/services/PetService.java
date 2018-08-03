package com.skmangalam.petclinic.services;

import com.skmangalam.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet save(Pet pet);

    Pet findByLastName(String lastName);

    Set<Pet> findAll();
}
