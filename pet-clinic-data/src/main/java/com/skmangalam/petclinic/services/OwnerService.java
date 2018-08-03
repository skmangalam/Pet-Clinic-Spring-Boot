package com.skmangalam.petclinic.services;

import com.skmangalam.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
