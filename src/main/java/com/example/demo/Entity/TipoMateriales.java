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
@Table(name = "TipoMateriales")
public class TipoMateriales {
     @Id
    @Column(name = "TM_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;

    @Column(name = "TM_Nombre")
    private String editNombreeditorial;
   
    @Column(name = "TM_Tipo")
    private String editUsuario;
}
