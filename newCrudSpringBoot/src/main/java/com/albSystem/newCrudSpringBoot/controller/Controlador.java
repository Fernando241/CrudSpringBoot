
package com.albSystem.newCrudSpringBoot.controller;


import com.albSystem.newCrudSpringBoot.interfaceService.iSPersona;
import com.albSystem.newCrudSpringBoot.model.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Anotaciones
@Controller
@RequestMapping

public class Controlador {
    
    @Autowired
    private iSPersona service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
    
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }
    
    @PostMapping("/save")
    public String save(@Validated Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona>persona=service.listarId(id);
        model.addAttribute("persona", persona);
        return "form";
    }
    
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
