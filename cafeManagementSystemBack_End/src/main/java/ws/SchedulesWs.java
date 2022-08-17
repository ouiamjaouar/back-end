/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import java.util.Date;
import java.util.List;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.schedulesService;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/schedules")
public class SchedulesWs {
    
    private schedulesService schedulesservice ;

    @GetMapping("/date/{date}")
    public List<Schedules> findByDate(Date date) {
        return schedulesservice.findByDate(date);
    }

    @Transactional
    @DeleteMapping("/")
    public int deleteByDate(Date date) {
        return schedulesservice.deleteByDate(date);
    }
     
    
}

