package com.crosstown.wisdompets.service;

import com.crosstown.wisdompets.domain.Pet;
import com.crosstown.wisdompets.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author developer
 * @date 2019-06-24
 * @time 22:39
 */
@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Set<Pet> getPets() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().iterator().forEachRemaining(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        Optional<Pet> pet = petRepository.findById(id);

        if (!pet.isPresent()) {
            throw new RuntimeException("Pet not found!");
        }
        return pet.get();
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);

    }
}

