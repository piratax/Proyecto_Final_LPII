



package com.example.demo.Controller;

import com.example.demo.Entity.Persona;
import com.example.demo.Service.PersonaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author franc
 */
@RestController
@RequestMapping("/persona")
@Api(value = "Microservicio de una persona", description = "Microservicio de personas")
public class PersonaController {
     @Autowired
    PersonaService personaService;

    @ApiOperation(value = "Lista de personas")
    @GetMapping
    public List<Persona> findAll() {
        return (List<Persona>) personaService.findAll();
    }

    @ApiOperation(value = "Lista de personas")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Persona> findById(@PathVariable Long id) {
        Persona persona = personaService.findById(id);
        return ResponseEntity.ok(persona);
    }

    @ApiOperation(value = "registrar una persona")
    @PostMapping
    public Persona save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @ApiOperation(value = "Elimina una persona")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        personaService.deleteById(id);
    }
}
