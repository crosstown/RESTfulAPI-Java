package com.crosstown.wisdompets.repository;

import com.crosstown.wisdompets.domain.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * @author developer
 * @date 2019-06-24
 * @time 22:29
 */

public interface PetRepository extends CrudRepository<Pet, Long> {


}
