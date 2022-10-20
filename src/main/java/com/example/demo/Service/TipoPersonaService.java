/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Entity.TipoPersona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public interface TipoPersonaService  {
    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipoPersona);

    public void delete(TipoPersona tipoPersona);

    public void deleteById(Long id);
}
