
package com.albSystem.newCrudSpringBoot.interfaces;

import com.albSystem.newCrudSpringBoot.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersona extends CrudRepository<Persona, Integer>{
    
}
