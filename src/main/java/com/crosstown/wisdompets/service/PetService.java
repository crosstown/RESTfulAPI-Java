package com.crosstown.wisdompets.service;

import com.crosstown.wisdompets.domain.Pet;

import java.util.Set;

/**
 * @author developer
 * @date 2019-06-24
 * @time 22:43
 */
public interface PetService {
    Set<Pet> getPets();

    Pet findById(Long id);

    void deleteById(Long id);
}
