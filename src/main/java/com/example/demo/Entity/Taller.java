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
@Table(name = "Taller")
public class Taller {
     @Id
    @Column(name = "taller_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tallerId;

    @Column(name = "taller_nombre")
    private String tallerNombre;

    @Column(name = "taller_fechaIni")
    private String tallerFecha;

    @Column(name = "taller_descripcion")
    private String tallerDescripcion;

    @Column(name = "taller_lugar")
    private String tallerLugar;

    @ManyToOne ()//De muchos a uno
    @JoinColumn(name = "prog_id")
    private Programa programa;

}
