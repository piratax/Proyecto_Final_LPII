/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.Materiales;
import com.example.demo.Service.MaterialesService;
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
@RequestMapping("/materiales")
@Api(value = "Microservicio de materiales", description = "Microservicio de materiales")
public class MaterialesController {
       @Autowired
    MaterialesService materialesService;

    @ApiOperation(value = "Lista de materiales")
    @GetMapping
    public List<Materiales> findAll() {
        return (List<Materiales>) materialesService.findAll();
    }

    @ApiOperation(value = "Lista un material")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Materiales> findById(@PathVariable Long id) {
        Materiales materiales = materialesService.findById(id);
        return ResponseEntity.ok(materiales);
    }

    @ApiOperation(value = "registrar un material")
    @PostMapping
    public Materiales save(@RequestBody Materiales materiales) {
        return materialesService.save(materiales);
    }

    @ApiOperation(value = "Elimina una material")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        materialesService.deleteById(id);
    }
}
