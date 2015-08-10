package com.service;


import java.io.Serializable;
import java.util.List;
import com.bean.ControlBean;
import com.service.ControlService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dtScrollView")
@SessionScoped
public class ScrollView implements Serializable {
    
   private List<ControlBean> cars1;
   private List<ControlBean> cars2;
   private List<ControlBean> cars3;
   private List<ControlBean> cars4;
   private List<ControlBean> cars5;
   private List<ControlBean> cars6;
    
   @ManagedProperty(value="#{carService}")
   private ControlService service;

   @PostConstruct
   public void init() {
       cars1 = service.createCars(50);
       cars2 = service.createCars(10);
       cars3 = service.createCars(50);
       cars4 = service.createCars(50);
       cars5 = service.createCars(50);
       cars6 = service.createCars(200);
   }

   public List<ControlBean> getCars1() {
       return cars1;
   }

   public List<ControlBean> getCars2() {
       return cars2;
   }

   public List<ControlBean> getCars3() {
       return cars3;
   }

   public List<ControlBean> getCars4() {
       return cars4;
   }

   public List<ControlBean> getCars5() {
       return cars5;
   }

   public List<ControlBean> getCars6() {
       return cars6;
   }

   public void setService(ControlService service) {
       this.service = service;
   }
}
