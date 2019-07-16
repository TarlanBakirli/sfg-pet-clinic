package com.tarlanbakirli.sfgpetclinic.services;

import com.tarlanbakirli.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
