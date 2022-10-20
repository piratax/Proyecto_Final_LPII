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
@Table(name = "Persona")
public class Persona {
    @Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "pers_nombre")
    private String persNombre;

    @Column(name = "pers_apellido")
    private String persApellido;

    @Column(name = "pers_dni")
    private String persDNI;

    @Column(name = "pers_correo")
    private String persCorreo;

    @Column(name = "pers_numero")
    private String PersNumero;
}
