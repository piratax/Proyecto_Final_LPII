/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.TipoMateriales;
import com.example.demo.Service.TipoMaterialesService;
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
@RequestMapping("/TipoMateriales")
@Api(value = "Microservicio de TipoMateriales", description = "Microservicio de TipoMateriales")
public class TipoMaterialesController {
     @Autowired
    TipoMaterialesService tipoMaterialesService;

    @ApiOperation(value = "Lista de TipoMateriales")
    @GetMapping
    public List<TipoMateriales> findAll() {
        return (List<TipoMateriales>) tipoMaterialesService.findAll();
    }

    @ApiOperation(value = "Lista un TipoMateriales")
    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoMateriales> findById(@PathVariable Long id) {
        TipoMateriales tipoMateriales = tipoMaterialesService.findById(id);
        return ResponseEntity.ok(tipoMateriales);
    }

    @ApiOperation(value = "registrar un TipoMateriales")
    @PostMapping
    public TipoMateriales save(@RequestBody TipoMateriales tipoMateriales) {
        return tipoMaterialesService.save(tipoMateriales);
    }

    @ApiOperation(value = "Elimina una TipoMateriales")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        tipoMaterialesService.deleteById(id);
    }
}
