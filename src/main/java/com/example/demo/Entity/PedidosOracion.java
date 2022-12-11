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
public class PedidosOracion {
    @Id
    @Column(name = "PedidoId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PedidoId;


    @Column(name = "Descripcion")
    private String PedDesc;

    @ManyToOne
    @JoinColumn(name = "pers_id")
    private Persona persona ;
}
