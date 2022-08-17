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
public class schedules {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long id ;
    private Date date   ;
    private Date open_time   ;
    private Date close_time  ;
    private Long references  ;

    public schedules() {
    }

    public schedules(Long id, Date date, Date open_time, Date close_time) {
        this.id = id;
        this.date = date;
        this.open_time = open_time;
        this.close_time = close_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getOpen_time() {
        return open_time;
    }

    public void setOpen_time(Date open_time) {
        this.open_time = open_time;
    }

    public Date getClose_time() {
        return close_time;
    }

    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    @Override
    public String toString() {
        return "schedules{" + "id=" + id + ", date=" + date + ", open_time=" + open_time + ", close_time=" + close_time + '}';
    }
    
    
   
}
