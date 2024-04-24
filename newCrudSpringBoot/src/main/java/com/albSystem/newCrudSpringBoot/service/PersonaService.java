
package com.albSystem.newCrudSpringBoot.service;

import com.albSystem.newCrudSpringBoot.interfaceService.iSPersona;
import com.albSystem.newCrudSpringBoot.interfaces.iPersona;
import com.albSystem.newCrudSpringBoot.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements iSPersona{

    @Autowired
    private iPersona data;
    
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        
        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res=0;
        Persona persona=data.save(p);
        if(!persona.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}
