/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.TipoPersona;
import com.example.demo.Service.TipoPersonaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author franc
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/tipoPersona")
@Api(value = "Microservicio de TipoPersona", description = " TipoPersona")
public class TipoPersonaController {
    @Autowired
    TipoPersonaService tipoPersonaService;

    @ApiOperation(value = "Lista de TipoPersona")
    @GetMapping


    
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Lista de tipos de Personas");
        result.put("data", tipoPersonaService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtiene datos de los diferentes tipos de persona")
    @GetMapping("/{id}")
    public ResponseEntity<TipoPersona> findById(@PathVariable Long id) {
        TipoPersona tipoPersona = tipoPersonaService.findById(id);
        return ResponseEntity.ok(tipoPersona);
    }

    @ApiOperation(value = "Crea un tipo de persona")
    @PostMapping
    public ResponseEntity<?> save(@RequestBody TipoPersona tipoPersona) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Material registrado correctamente");
        result.put("data", tipoPersonaService.save(tipoPersona));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Modifica un tipo de Persona")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody TipoPersona tipoPersona) {
        HashMap<String, Object> result = new HashMap<>();
        TipoPersona data = tipoPersonaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe el tipo de persona con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            TipoPersona.setMId(id);
            tipoPersonaService.save(tipoPersona);
            result.put("success", true);
            result.put("message", "Datos actualizados correctamente.");
            result.put("data", tipoPersona);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Elimina un tipo de Persona")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        HashMap<String, Object> result = new HashMap<>();
        TipoPersona data = tipoPersonaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe tipo de persona con id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        } else {
            tipoPersonaService.deleteById(id);
            result.put("success", true);
            result.put("message", "Registro eliminado correctamente.");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }
}
