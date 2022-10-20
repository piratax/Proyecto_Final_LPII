/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.Entity.PersonaTaller;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public interface PersonaTallerService {
      public List<PersonaTaller> findAll();

    public PersonaTaller findById(Long id);

    public PersonaTaller save(PersonaTaller personaTaller);

    public void delete(PersonaTaller personaTaller);

    public void deleteById(Long id);
}
