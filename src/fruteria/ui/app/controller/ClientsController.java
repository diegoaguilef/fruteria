/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.controller;

import fruteria.ui.app.model.Client;
import java.util.ArrayList;

/**
 *
 * @author kdieg
 */
public class ClientsController {
  private static ArrayList<Client> clients = new ArrayList<>();

  public static ArrayList<Client> getClients(){
      return clients;
  }

  public static void fillClients(){
    create(new Client("1-1", "Diego", "ResIT", "Av. Providencia 1650", "resit.jpg"));
    create(new Client("2-2", "Andrés", "ResIT", "Av. Providencia 1650", ""));
    create(new Client("3-3", "Carlos", "Promac", "Tongoy 750", ""));
    create(new Client("4-4", "Mario", "Amanecer", "Nueva de Lyon 145", ""));
  }

  public static boolean create(Client client){
    for(Client f:clients){
      if(f.getRut().equals(client.getRut())){
          return false;
      }
    }
    clients.add(client);
    return true;
  }
    
    public static boolean update(Client client){
        int i = 0;
        for(Client f:clients){
            if(f.getRut().equals(client.getRut())){
                clients.set(i, client);
                return true;
            }
            i++;
        }
        return false;
    }
    
    public static Client show(String rut){
        Client client = null;
        int i = 0;
        for(Client c:clients){
            if(c.getRut().equals(rut)){
                client = c;
            }
        }
        return client;
    }
    
    public static boolean delete(String rut){
        int i = 0;
        for(Client f:clients){
            if(f.getRut().equals(rut)){
                clients.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
  
}