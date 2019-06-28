package com.crosstown.wisdompets.Controller;

import com.crosstown.wisdompets.domain.Pet;
import com.crosstown.wisdompets.domain.Request.PetRequest;
import com.crosstown.wisdompets.domain.Response.PetResponse;
import com.crosstown.wisdompets.service.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author developer
 * @date 2019-06-24
 * @time 22:59
 */
@RestController
@RequestMapping("pets/")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PetResponse> allPets() {
        return new ResponseEntity<>(new PetResponse(), HttpStatus.OK);

    }
    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PetResponse> createPet(@RequestBody PetRequest petRequest) {
        return new ResponseEntity<>(new PetResponse(), HttpStatus.CREATED);
    }
    @RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PetResponse> updatePet(@RequestBody PetRequest petRequest) {
        return new ResponseEntity<>(new PetResponse(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{petId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletePet(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
