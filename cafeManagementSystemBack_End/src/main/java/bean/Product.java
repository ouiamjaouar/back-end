
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Acer
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    
    
    private Long id;
    private String name;
    @ManyToOne
    private Categorie categorie;
    private String description ;
    private Long prix;
    private String status;
    private Long reference;

    public Product() {
    }

    public Product(Long id, String name, Categorie categorie, String description, Long prix, String status, Long reference) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;
        this.description = description;
        this.prix = prix;
        this.status = status;
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", categorie=" + categorie + ", description=" + description + ", prix=" + prix + ", status=" + status + ", reference=" + reference + '}';
    }
    
    
    

     
    
}
