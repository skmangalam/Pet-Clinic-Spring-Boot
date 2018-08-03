package com.skmangalam.petclinic.services;

import com.skmangalam.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet save(Vet vet);

    Vet findByLastName(String lastName);

    Set<Vet> findAll();
}
