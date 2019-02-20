package com.taqy.learning.taqypetclinic.services;

import com.taqy.learning.taqypetclinic.model.Vet;

import java.util.Set;

/**
 * Create by TA on 2019-02-21
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
