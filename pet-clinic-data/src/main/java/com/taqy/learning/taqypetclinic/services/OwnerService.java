package com.taqy.learning.taqypetclinic.services;

import com.taqy.learning.taqypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
