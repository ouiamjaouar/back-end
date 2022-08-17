/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Categorie;
import dao.CategorieDao;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Acer
 */
public class CategorieServiceImpl {
    private CategorieDao categoriedao ;

    public List<Categorie> findAll() {
        return categoriedao.findAll();
    }

    public List<Categorie> findByLibelle(String libelle) {
        return categoriedao.findByLibelle(libelle);
    }

     @Transactional
    public int deleteByLibelle(String libelle) {
        return categoriedao.deleteByLibelle(libelle);
    }
    
    public int save(Categorie categorie){
        if (findByLibelle(categorie.getLibelle())!=null){
            return -1;
        }
        else{
            categoriedao.save(categorie);
            return 1;
        }
    }
 
    
    
}
