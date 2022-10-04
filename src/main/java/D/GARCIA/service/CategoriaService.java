/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package D.GARCIA.service;

import D.GARCIA.entity.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria save(Categoria categoria);

    public void delete(Categoria categoria);

    public void deleteById(Long id);
    
    
    
}