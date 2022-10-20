/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Entity.TipoMateriales;
import java.util.List;



public interface TipoMaterialesService {
    
  public List<TipoMateriales> findAll();

    public TipoMateriales findById(Long id);

    public TipoMateriales save(TipoMateriales tipoMateriales);

    public void delete(TipoMateriales tipoMateriales);

    public void deleteById(Long id);
}
