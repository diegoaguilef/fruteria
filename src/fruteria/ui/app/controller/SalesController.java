/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.controller;

import fruteria.ui.app.model.Client;
import fruteria.ui.app.model.Fruit;
import fruteria.ui.app.model.Sale;
import java.util.ArrayList;
import fruteria.ui.app.helper.Date;

/**
 *
 * @author kdieg
 */
public class SalesController {
  private static ArrayList<Sale> sales = new ArrayList<>();

  public static ArrayList<Sale> getSales(){
      return sales;
  }
  
  public static void fillSales(){
    Client client;
    Fruit fruit;
    Date date;
    client = new Client("1-1", "Diego", "ResIT", "Padre hurtado 12067", "");
    fruit = new Fruit("Cerezo", "Lapins", 1000, 80, "cerezo_lapins.jpg");
    date = new Date(2, 12, 2018);
    create(new Sale(1, fruit, client, date, 12, 12000));
    
    date = new Date(11, 9, 2018);
    create(new Sale(2, fruit, client, date, 20, 12000));
    
    date = new Date(2, 12, 2018);
    create(new Sale(3, fruit, client, date, 5, 12000));
    
    fruit = new Fruit("Kiwi", "Hayward", 600, 40, "kiwi_hayward.jpg");
    date = new Date(5, 1, 2018);
    create(new Sale(4, fruit, client, date, 13, 12000));
    
    client = new Client("2-2", "Andrés", "ResIT", "Av. Providencia 1650", "");
    fruit = new Fruit("Durazno", "Rich Lady", 590, 55, "durazno_richlady.jpg");
    date = new Date(2, 11, 2018);
    create(new Sale(5, fruit, client, date, 12, 12000));
    
    fruit = new Fruit("Uva", "Muscat", 450, 30, "uva_muscat.jpg");
    date = new Date(4, 12, 2018);
    create(new Sale(6, fruit, client, date, 3, 12000));
    
    date = new Date(23, 11, 2018);
    create(new Sale(7, fruit, client, date, 3, 12000));
    
    client = new Client("3-3", "Carlos", "Promac", "Tongoy 750", "");
    fruit = new Fruit("Uva", "Muscat", 450, 30, "uva_muscat.jpg");
    date = new Date(30, 4, 2018);
    create(new Sale(8, fruit, client, date, 12, 12000));
    
    fruit = new Fruit("Durazno", "Rich Lady", 590, 55, "durazno_richlady.jpg");
    date = new Date(2, 5, 2018);
    create(new Sale(9, fruit, client, date, 2, 12000));
    
    fruit = new Fruit("Uva", "Muscat", 450, 30, "uva_muscat.jpg");
    date = new Date(9, 5, 2018);
    create(new Sale(10, fruit, client, date, 2, 12000));
    
  }
    
  public static boolean create(Sale sale){
    for(Sale s:sales){
      if(s.getTicket() == sale.getTicket()){
        return false;
      }
    }
    sales.add(sale);
    return true;
  }
    
  public static boolean update(Sale sale){
    int i = 0;
    for(Sale f:sales){
      if(f.getTicket() == sale.getTicket()){
        sales.set(i, sale);
        return true;
      }
      i++;
    }
    return false;
  }
    
  public static Sale find(int id){
    Sale sale = null;
    int i = 0;
    for(Sale f:sales){
      if(f.getTicket() == id){
          sale = f;
      }
    }
    return sale;
  }
    
  public static boolean delete(int id){
    int i = 0;
    for(Sale f:sales){
      if(f.getTicket() == id){
          sales.remove(i);
          return true;
      }
      i++;
    }
    return false;
  }
}
