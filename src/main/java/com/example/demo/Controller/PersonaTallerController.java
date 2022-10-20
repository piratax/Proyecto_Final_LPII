/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Entity.PersonaTaller;
import com.example.demo.Service.PersonaTallerService;
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


@RestController
@RequestMapping("/PersonaTaller")
@Api(value = "Microservicio de PersonaTaller", description = "Microservicio de PersonaTaller")
public class PersonaTallerController {
     @Autowired
    PersonaTallerService personaTallerService;

    @ApiOperation(value = "Lista de PersonaTaller")
    @GetMapping
    public List<PersonaTaller> findAll() {
        return (List<PersonaTaller>) personaTallerService.findAll();
    }

    @ApiOperation(value = "Lista un PersonaTaller")
    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonaTaller> findById(@PathVariable Long id) {
        PersonaTaller editorial = personaTallerService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @ApiOperation(value = "registrar un PersonaTaller")
    @PostMapping
    public PersonaTaller save(@RequestBody PersonaTaller editorial) {
        return personaTallerService.save(editorial);
    }

    @ApiOperation(value = "Elimina una PersonaTaller")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        personaTallerService.deleteById(id);
    }
}
