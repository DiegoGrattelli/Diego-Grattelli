/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D.GARCIA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
        
@Entity
@Data
@Table(name = "categoria")
public class Categoria {
    
    @Id
    @Column(name = "cate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CateId;
    
    @Column(name = "cate_nombre")
    private String cateNombre;
     
    @Column(name = "cate_descripcion")
    private String cateDescripcion;
    
    @Column(name = "cate_Prioridad")
    private String catePrioridad;
    
}    
