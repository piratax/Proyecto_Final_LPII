/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.ServiceImpl;

import com.example.demo.Entity.TipoMateriales;
import com.example.demo.Repository.TipoMaterialesRepository;
import com.example.demo.Service.TipoMaterialesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public class TipoMaterialesServiceImpl implements TipoMaterialesService {
    @Autowired
    private TipoMaterialesRepository tipoMaterialesRepository;

   @Override
    public List<TipoMateriales> findAll() {
        return (List<TipoMateriales>) tipoMaterialesRepository.findAll();
    }

    @Override
    public TipoMateriales findById(Long id){
        return tipoMaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public TipoMateriales save(TipoMateriales editorial) {
        return tipoMaterialesRepository.save(editorial);
    }

    @Override
    public void delete(TipoMateriales editorial) {
        tipoMaterialesRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        tipoMaterialesRepository.deleteById(id);
    } 
}
