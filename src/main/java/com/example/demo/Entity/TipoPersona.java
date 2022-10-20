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
@Table(name = "TipoPersona")
public class TipoPersona {
    @Id
    @Column(name = "TP_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TPId;

    @Column(name = "TP_Tipo")
    private String TPtipo;
   
    @Column(name = "TP_IdPersona")
    private String TPIdPersona;

}
