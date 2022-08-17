/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import bean.Reservation;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ReservationServiceImpl;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/Reservation")
public class ReservationWs {
    
    private ReservationServiceImpl seservationserviceimpl ;

     @GetMapping("/reference/{reference}")
    public List<Reservation> findByReference(Long reference) {
        return seservationserviceimpl.findByReference(reference);
    }

    @Transactional
    public int deleteByReference(Long reference) {
        return seservationserviceimpl.deleteByReference(reference);
    }

    @PostMapping("/")
    public void add(Reservation reservation) throws Exception {
        seservationserviceimpl.add(reservation);
    }
    
    
    
    
    
}
