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
public class Encuesta {
    @Id
    @Column(name = "EncuId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EncuId;



  

    @Column(name = "resp1")
    private String EncuResp1;

    @Column(name = "resp2")
    private String EncuResp2;

    @Column(name = "resp3")
    private String EncuResp3;

  @ManyToOne
    @JoinColumn(name = "pers_id")
    private Persona persona ;

}
