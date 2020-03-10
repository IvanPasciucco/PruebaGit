
package edu.prueba;

import edu.prueba.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo")
    private String saludo;
    
    
    @GetMapping("/")
    public String inicio(Model model){
    var mensaje="hola mundo con thymeleaf";
    var persona= new Persona();
    persona.setNombre("ivan");
    persona.setApellido("pasciucco");
    persona.setEmail("pasciucco14@gmail.com");
    persona.setTelefono("2613143444");
    
    var persona2= new Persona();
    persona2.setNombre("Milton");
    persona2.setApellido("Friedman");
    persona2.setEmail("pasciucco14@gmail.com");
    persona2.setTelefono("2613143444");
     
    //var personas= new ArrayList();
    //personas.add(persona);
    //personas.add(persona2);
    var personas= Arrays.asList(persona,persona2);
    log.info("ejecutando el controlador Spring MVC");
    model.addAttribute("mensaje", mensaje);
    model.addAttribute("saludo",saludo);
   //model.addAttribute("persona",persona);
    model.addAttribute("personas",personas);
   
    return "index";
    



}
    
}
