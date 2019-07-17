package com.tarlanbakirli.sfgpetclinic.services.map;

import com.tarlanbakirli.sfgpetclinic.model.Vet;
import com.tarlanbakirli.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Tarlan Bakirli on 7/16/2019
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
