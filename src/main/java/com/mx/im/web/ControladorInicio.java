package com.mx.im.web;



import com.mx.im.domain.Persona;
import com.mx.im.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class ControladorInicio {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String listar(Model model) {

       var personas = personaService.listarPersona();
        model.addAttribute("personas", personas);
        return "index";

    }

    @GetMapping("/agregar")
    public String agregar (Persona persona){
        return "modificar";

    }

    @PostMapping("/guardar")
     public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
     }

     @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona,Model model){
        persona=personaService.encontrarPersona(persona);
        model.addAttribute("persona",persona);
        return "modificar";

     }

     @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";

     }








}
