/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author franc
 */
public class Informes {
        @Id
    @Column(name = "InforId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long InforId;

    @Column(name = "Descripcion")
    private String InfDesc;

    @Column(name = "Evidencia")
    private String InfEvi;

    @ManyToOne
    @JoinColumn(name = "pers_id")
    private Persona persona ;
}
