package jacek.springframweork.petclinic.services;

import jacek.springframweork.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
