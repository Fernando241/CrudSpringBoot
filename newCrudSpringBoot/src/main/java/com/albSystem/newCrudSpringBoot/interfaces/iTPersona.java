
package com.albSystem.newCrudSpringBoot.interfaces;

import com.albSystem.newCrudSpringBoot.model.tipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iTPersona extends CrudRepository<tipoPersona, Integer>{
    
}
