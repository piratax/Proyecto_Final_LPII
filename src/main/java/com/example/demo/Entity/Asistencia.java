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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author franc
 */
@Data
@Entity
@Table(name ="Asistencia")
public class Asistencia {
     @Id
    @Column(name = "Asis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AsisId;



    @ManyToOne
    @JoinColumn(name = "pers_id")
    private Persona persona ;

    

}