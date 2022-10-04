/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D.GARCIA.Controller;

import D.GARCIA.entity.Producto;
import D.GARCIA.service.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@Api(value = "Microservicio de gestion de producto", description = "Microservicio de gestion de producto")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @ApiOperation(value = "Lista de producto")
    @GetMapping("/all")
    public List<Producto> findAll(){
      return productoService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de producto")
    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable Long id){
        Producto producto = productoService.findById(id);
        return ResponseEntity.ok(producto);
    }
    
    @ApiOperation(value = "Crea una producto")
    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    
    @ApiOperation(value = "Modifica una producto")
    @PutMapping("/update")
    public Producto update(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    
    
    @ApiOperation(value = "Elimina un producto")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        productoService.deleteById(id);
    }
}
