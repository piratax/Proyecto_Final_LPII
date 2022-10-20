/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repository;

import com.example.demo.Entity.TipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author franc
 */
@Repository
public interface TipoPersonaRepository extends CrudRepository<TipoPersona, Long>  {
    
}
