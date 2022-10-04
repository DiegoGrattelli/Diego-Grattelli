/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package D.GARCIA.service;

import D.GARCIA.entity.Producto;
import java.util.List;

public interface ProductoService {
    
    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void delete(Producto producto);

    public void deleteById(Long id);
}
