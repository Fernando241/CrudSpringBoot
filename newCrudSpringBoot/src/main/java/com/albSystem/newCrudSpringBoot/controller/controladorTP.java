
package com.albSystem.newCrudSpringBoot.controller;


import com.albSystem.newCrudSpringBoot.interfaceService.iSTPersona;
import com.albSystem.newCrudSpringBoot.model.tipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping

public class controladorTP {
    
    @Autowired
    private iSTPersona service;
    
    @GetMapping("/listarTP")
    public String listarTP(Model model){
        List<tipoPersona>tipoPersonas = service.listarTP();
        model.addAttribute("tipoPersonas", tipoPersonas);
        return "indexTP";
    }
    
    @GetMapping("/newTP")
    public String agregarTP(Model model){
        model.addAttribute("tipoPersona", new tipoPersona());
        return "ingresarTP";
    }
    
    @PostMapping("/saveTP")
    public String saveTP(tipoPersona tP, Model model){
        service.saveTP(tP);
        return "redirect:/listarTP";
    }
    
    @GetMapping("/editarTP/{id}")
    public String editarTP(@PathVariable int id, Model model){
        Optional<tipoPersona>tipoPersonas = service.listarIdTP(id);
        model.addAttribute("tipoPersona", tipoPersonas);
        return "ingresarTP";
    }
    
    @GetMapping("/eliminarTP/{id}")
    public String deleteTP(Model model, @PathVariable int id){
        service.deleteTP(id);
        return "redirect:/listarTP";
    }
}
