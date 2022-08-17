/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;



import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Schedules;

/**
 *
 * @author Acer
 */
public interface SchedulesDao extends JpaRepository< Schedules,Long >{
    
   List< Schedules>  findByDate (Date date );
     int deleteByDate(Date date );
    
}
