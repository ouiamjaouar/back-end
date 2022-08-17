/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import bean.Categorie;
import bean.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CategorieServiceImpl;
import service.ReservationServiceImpl;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/categorie")

public class CategorieWs {
    @Autowired
    private CategorieServiceImpl categorieserviciImpl;

    @GetMapping("/libelle/{libelle}")
    public List<Categorie> findByLibelle(String libelle) {
        return categorieserviciImpl.findByLibelle(libelle);
    }

    @Transactional
    @DeleteMapping("/")
    public int deleteByLibelle(String libelle) {
        return categorieserviciImpl.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieserviciImpl.findAll();
    }

     @PostMapping("/")
    public int save(@RequestBody Categorie categorie) {
        return categorieserviciImpl.save(categorie);
    }

    

    
    
    
}
