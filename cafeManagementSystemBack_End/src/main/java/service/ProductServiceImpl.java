/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Product;
import dao.ProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class ProductServiceImpl {
    
    @Autowired
    private ProductDao productdao;

    public List<Product> findByReference(Long reference) {
        return productdao.findByReference(reference);
    }

    public int deleteByReference(Long reference) {
        return productdao.deleteByReference(reference);
    }
    
    
     public int save(Product product){
        if(findByReference(product.getReference())!=null){
            return -1;
        
        }
        if(findByReference(product.getReference())!=null){
            return -2;
        
        }
        else{
            productdao.save(product);
            return 1;
        }
    }
     
      public int updateLibelle(Product product,String description){
        if(findByReference(product.getReference())!=null) {
            return -1;
        }
            else{
                product.setDescription(description);
                productdao.save(product);
            return 1;
        }
    }
     
}
