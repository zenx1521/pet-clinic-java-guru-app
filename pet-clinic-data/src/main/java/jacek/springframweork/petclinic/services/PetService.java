package jacek.springframweork.petclinic.services;

import jacek.springframweork.petclinic.model.Owner;
import jacek.springframweork.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
