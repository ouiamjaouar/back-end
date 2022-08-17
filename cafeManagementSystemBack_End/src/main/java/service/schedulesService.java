/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.SchedulesDao;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service

public class schedulesService {
    
     @Autowired
    private SchedulesDao Schedulesdao;

    public List<Schedules> findByDate(Date date) {
        return Schedulesdao.findByDate(date);
    }

    public int deleteByDate(Date date) {
        return Schedulesdao.deleteByDate(date);
    }
     
     
     
}

