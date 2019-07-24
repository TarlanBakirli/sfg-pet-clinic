package com.tarlanbakirli.sfgpetclinic.repositories;

import com.tarlanbakirli.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
