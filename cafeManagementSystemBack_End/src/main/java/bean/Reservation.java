/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Acer
 */
@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id ;
    private Long reference  ;
    private String f_name  ;
    private String l_name ;
    private int num_guests ;
    private int num_tables ;
    private Date rdate  ;
    private String telephone ;
    private String comment ;

    public Reservation() {
    }

    

    public Reservation(Long id, String f_name, String l_name, int num_guests, int num_tables, Date rdate, String telephone, String comment) {
        this.id = id;
        this.reference=reference;
        this.f_name = f_name;
        this.l_name = l_name;
        this.num_guests = num_guests;
        this.num_tables = num_tables;
        this.rdate = rdate;
        this.telephone = telephone;
        this.comment = comment;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long referance) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getNum_guests() {
        return num_guests;
    }

    public void setNum_guests(int num_guests) {
        this.num_guests = num_guests;
    }

    public int getNum_tables() {
        return num_tables;
    }

    public void setNum_tables(int num_tables) {
        this.num_tables = num_tables;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Reservaion{" + "id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", num_guests=" + num_guests + ", num_tables=" + num_tables + ", rdate=" + rdate + ", telephone=" + telephone + ", comment=" + comment + '}';
    }
    
        
}
