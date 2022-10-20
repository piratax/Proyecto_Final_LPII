/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.Taller;
import com.example.demo.Service.TallerService;
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
@RequestMapping("/Taller")
@Api(value = "Microservicio de Taller", description = "Microservicio de Taller")
public class TallerController {
@Autowired
    TallerService tallerService;

    @ApiOperation(value = "Lista de Taller")
    @GetMapping
    public List<Taller> findAll() {
        return (List<Taller>) tallerService.findAll();
    }

    @ApiOperation(value = "Lista un Taller")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Taller> findById(@PathVariable Long id) {
        Taller taller = tallerService.findById(id);
        return ResponseEntity.ok(taller);
    }

    @ApiOperation(value = "registrar un Taller")
    @PostMapping
    public Taller save(@RequestBody Taller taller) {
        return tallerService.save(taller);
    }

    @ApiOperation(value = "Elimina una Taller")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        tallerService.deleteById(id);
    }
    
}
