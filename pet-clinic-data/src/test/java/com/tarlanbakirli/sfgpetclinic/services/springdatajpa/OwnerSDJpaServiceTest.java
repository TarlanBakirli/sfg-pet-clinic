package com.tarlanbakirli.sfgpetclinic.services.springdatajpa;

import com.tarlanbakirli.sfgpetclinic.model.Owner;
import com.tarlanbakirli.sfgpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    Owner returnOwner;

    @BeforeEach
    void setUp() {

        returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();

    }

    @Test
    void findByLastName() {


        Mockito.when(ownerRepository.findByLastName(Mockito.any())).thenReturn(returnOwner);

        Owner smith = ownerSDJpaService.findByLastName(LAST_NAME);

        Assertions.assertEquals(LAST_NAME, smith.getLastName());

        Mockito.verify(ownerRepository).findByLastName(Mockito.any());
    }

    @Test
    void findAll() {

        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1L).build());
        returnOwnersSet.add(Owner.builder().id(1L).build());

        Mockito.when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = ownerSDJpaService.findAll();

        Assertions.assertNotNull(owners);
        Assertions.assertEquals(2, owners.size());

    }

    @Test
    void findById() {

        Mockito.when(ownerRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerSDJpaService.findById(1L);

        Assertions.assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {

        Mockito.when(ownerRepository.findById(Mockito.anyLong())).thenReturn(Optional.empty());

        Owner owner = ownerSDJpaService.findById(1L);

        Assertions.assertNull(owner);

    }

    @Test
    void save() {

        Owner ownerToSave = Owner.builder().id(1L).build();

        Mockito.when(ownerRepository.save(Mockito.any())).thenReturn(ownerToSave);

        Owner savedOwner = ownerSDJpaService.save(ownerToSave);

        Assertions.assertNotNull(savedOwner);

        Mockito.verify(ownerRepository).save(Mockito.any());
    }

    @Test
    void delete() {

        ownerSDJpaService.delete(returnOwner);

        Mockito.verify(ownerRepository, Mockito.times(1)).delete(Mockito.any());

    }

    @Test
    void deleteById() {

        ownerSDJpaService.deleteById(1L);

        Mockito.verify(ownerRepository).deleteById(Mockito.anyLong());

    }
}