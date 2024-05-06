
package com.albSystem.newCrudSpringBoot.interfaceService;

import com.albSystem.newCrudSpringBoot.model.tipoPersona;
import java.util.List;
import java.util.Optional;

public interface iSTPersona {
    public List<tipoPersona>listarTP();
    public Optional<tipoPersona>listarIdTP(int id);
    public int saveTP(tipoPersona tP);
    public void deleteTP(int id);
}
