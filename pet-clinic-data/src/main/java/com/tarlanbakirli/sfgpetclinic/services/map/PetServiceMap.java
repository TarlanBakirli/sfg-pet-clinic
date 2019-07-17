package com.tarlanbakirli.sfgpetclinic.services.map;

import com.tarlanbakirli.sfgpetclinic.model.Pet;
import com.tarlanbakirli.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Tarlan Bakirli on 7/16/2019
 */

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
