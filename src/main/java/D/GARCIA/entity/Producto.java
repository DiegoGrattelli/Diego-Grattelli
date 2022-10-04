/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D.GARCIA.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class Producto implements Serializable{
    
    @Id
    @Column(name = "produc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producId;
    
    @Column(name = "produc_nombre")
    private String producNombre;
    
    @Column(name = "produc_descrip")
    private String producDescrip;
    
    @Column(name = "produc_precio")
    private String producPrecio;
    
    @Column(name = "produc_codigo")
    private String producCodigo;
    
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Categoria categoria;
    
    
}

