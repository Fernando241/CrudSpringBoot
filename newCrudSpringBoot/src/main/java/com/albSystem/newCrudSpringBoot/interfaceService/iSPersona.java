
package com.albSystem.newCrudSpringBoot.interfaceService;

import com.albSystem.newCrudSpringBoot.model.Persona;
import java.util.List;
import java.util.Optional;

public interface iSPersona {
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
