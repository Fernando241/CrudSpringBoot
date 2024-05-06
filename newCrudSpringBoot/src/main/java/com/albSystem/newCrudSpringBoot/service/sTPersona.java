
package com.albSystem.newCrudSpringBoot.service;

import com.albSystem.newCrudSpringBoot.interfaceService.iSTPersona;
import com.albSystem.newCrudSpringBoot.interfaces.iTPersona;
import com.albSystem.newCrudSpringBoot.model.tipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class sTPersona implements iSTPersona{

    @Autowired
    private iTPersona data;
    
    @Override
    public List<tipoPersona> listarTP() {
        return (List<tipoPersona>)data.findAll();
    }

    @Override
    public Optional<tipoPersona> listarIdTP(int id) {
        return data.findById(id);
    }

    @Override
    public int saveTP(tipoPersona tP) {
        int res=0;
        tipoPersona tipoPerson=data.save(tP);
        if(!tipoPerson.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void deleteTP(int id) {
        data.deleteById(id);
    }

}
