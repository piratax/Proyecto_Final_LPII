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
@Table(name = "Materiales")
public class Materiales {
    @Id
    @Column(name = "mate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mateId;

    @Column(name = "Mate_nombre")
    private String mateNombre;

    @Column(name = "Mate_Descripcion")
    private String mateDesc;

    @Column(name = "Mate_Detalle")
    private String MateDetalle;

    public void setMId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
