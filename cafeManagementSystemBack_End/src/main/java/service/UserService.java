/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.User;
import dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class UserService {
     @Autowired
    private UserDao userdao ;

    public User findBylogin(String login) {
        return userdao.findBylogin(login);
    }

    public List<User> findBlocked(boolean block) {
        return userdao.findBlocked(block);
    }

    public void deleteById(Long id) {
        userdao.deleteById(id);
    }
     
     public int save(User user) {
        if (findBylogin(user.getLogin()) != null) {
            return -1;
        } else {
            user.setBlock(true);
            userdao.save(user);
            return 1;
        }
    }
     
     public int seconecter(String login, String passeword) {
        User user = findBylogin(login); 
        if (user == null){
            return -1;
        }
        else if (!user.getPasseword().equals(passeword)){
            return -2; 
        }
        else if ( user.isBlock()== true )
        {
            return -3;
        }
        else
        {
            return 1;
        }
        
 
    }
    
}
