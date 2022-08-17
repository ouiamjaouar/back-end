/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Acer
 */
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    
    private Long id ;
    private String name  ;
    private String email  ;
    private String login  ;
    private String passeword ;
    
    private boolean block ;
    private String role ;

    public User() {
    }

    public User(Long id, String login, String passeword, boolean block, String role) {
        this.id = id;
        this.login = login;
        this.passeword = passeword;
        this.block = block;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasseword() {
        return passeword;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", passeword=" + passeword + ", block=" + block + ", role=" + role + '}';
    }
    
}
