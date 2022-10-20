/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.TipoPersona;
import com.example.demo.Service.TipoPersonaService;
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
@RequestMapping("/TipoPersona")
@Api(value = "Microservicio de TipoPersona", description = "Microservicio de TipoPersona")
public class TipoPersonaController {
    @Autowired
    TipoPersonaService tipoPersonaService;

    @ApiOperation(value = "Lista de TipoPersona")
    @GetMapping
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) tipoPersonaService.findAll();
    }

    @ApiOperation(value = "Lista un TipoPersona")
    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoPersona> findById(@PathVariable Long id) {
        TipoPersona tipoPersona = tipoPersonaService.findById(id);
        return ResponseEntity.ok(tipoPersona);
    }

    @ApiOperation(value = "registrar un TipoPersona")
    @PostMapping
    public TipoPersona save(@RequestBody TipoPersona tipoPersona) {
        return tipoPersonaService.save(tipoPersona);
    }

    @ApiOperation(value = "Elimina una TipoPersona")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        tipoPersonaService.deleteById(id);
    } 
}
