/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import bean.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductServiceImpl;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductWs {
    @Autowired
    private ProductServiceImpl productserviceimpl;

    @GetMapping("/reference/{reference}")
    public List<Product> findByReference(Long reference) {
        return productserviceimpl.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable Long reference) {
        return productserviceimpl.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Product product) {
        return productserviceimpl.save(product);
    }

    @PutMapping("/libelle/{libelle}")
    public int updateLibelle(@RequestBody Product product,@PathVariable String description) {
        return productserviceimpl.updateLibelle(product, description);
    }
    
    
    
}
