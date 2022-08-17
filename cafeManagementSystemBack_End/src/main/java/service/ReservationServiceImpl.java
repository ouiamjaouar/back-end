/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Reservation;
import dao.ReservationDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Acer
 */
@Service
public class ReservationServiceImpl {
    

    private ReservationRepository<Reservation, Long> ReservationRepository; 
    
    @Autowired
    private ReservationDao Reservationdao;

    public List<Reservation> findByReference(Long reference) {
        return Reservationdao.findByReference(reference);
    }

    public int deleteByReference(Long reference) {
        return Reservationdao.deleteByReference(reference);
    }
    
   
@Autowired 
public ReservationServiceImpl(ReservationRepository<Reservation, Long> ReservationRepository) { 
    
    this.ReservationRepository = ReservationRepository; 
}

    public void add(Reservation reservation) throws Exception { 
    if (reservation.getL_name()== null || "".equals(reservation.getL_name())) { 
        throw new Exception("reservation name cannot be null or empty string."); 
    } 

    if (ReservationRepository.equals((reservation.getL_name()))) { 
        throw new Exception(String.format("There is already a product with the name - %s", reservation.getL_name())); 
    } 

    Reservationdao.add(reservation); 
    
    
} 
    
    

    
    
    
    
}
