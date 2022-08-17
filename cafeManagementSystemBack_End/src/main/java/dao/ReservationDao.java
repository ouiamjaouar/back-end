/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import bean.Reservation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Acer
 */
public interface ReservationDao extends JpaRepository<Reservation, Long>  {
    
    List< Reservation> findByReference(Long reference);
    int deleteByReference(Long reference);

    public void add(Reservation reservation);
    
    
}
