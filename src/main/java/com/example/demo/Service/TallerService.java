/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Entity.Taller;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public interface TallerService {
       public List<Taller> findAll();

    public Taller findById(Long id);

    public Taller save(Taller taller);

    public void delete(Taller taller);

    public void deleteById(Long id);
}
