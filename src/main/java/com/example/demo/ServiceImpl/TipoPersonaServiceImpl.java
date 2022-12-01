/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.ServiceImpl;

import com.example.demo.Entity.TipoPersona;
import com.example.demo.Repository.TipoPersonaRepository;
import com.example.demo.Service.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author franc
 */
public class TipoPersonaServiceImpl  implements TipoPersonaService{
     @Autowired
private TipoPersonaRepository tipoPersonaRepository;
@Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) tipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return tipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        tipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        tipoPersonaRepository.deleteById(id);
    }
}
