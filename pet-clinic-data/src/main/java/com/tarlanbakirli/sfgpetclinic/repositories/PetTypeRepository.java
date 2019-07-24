package com.tarlanbakirli.sfgpetclinic.repositories;

import com.tarlanbakirli.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
