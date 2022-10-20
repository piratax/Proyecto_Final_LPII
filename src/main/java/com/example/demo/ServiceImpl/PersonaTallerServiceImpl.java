/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.ServiceImpl;

import com.example.demo.Entity.PersonaTaller;
import com.example.demo.Repository.PersonaTallerRepository;
import com.example.demo.Service.PersonaTallerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public class PersonaTallerServiceImpl implements PersonaTallerService{
@Autowired
    private PersonaTallerRepository personaTallerRepository;

    @Override
    public List<PersonaTaller> findAll() {
        return (List<PersonaTaller>) personaTallerRepository.findAll();
    }

    @Override
    public PersonaTaller findById(Long id) {
        return personaTallerRepository.findById(id).orElse(null);
    }

    @Override
    public PersonaTaller save(PersonaTaller editorial) {
        return personaTallerRepository.save(editorial);
    }

    @Override
    public void delete(PersonaTaller editorial) {
        personaTallerRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        personaTallerRepository.deleteById(id);
    }

    
}
