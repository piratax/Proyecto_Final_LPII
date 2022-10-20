/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author franc
 */
@Data
@Entity
@Table(name = "PersonaTaller")
public class PersonaTaller {
     @Id
    @Column(name = "PT_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ptId;

    @Column(name = "TI_idPersona")
    private String ptIdPersona;
   
    @Column(name = "TI_idTaller")
    private String ptIdTaller;
}
