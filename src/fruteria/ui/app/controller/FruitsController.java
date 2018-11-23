/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.controller;

import fruteria.ui.app.model.Fruit;
import java.util.ArrayList;

/**
 *
 * @author kdieg
 */
public class FruitsController {
    private static ArrayList<Fruit> fruits = new ArrayList<>();
    
    public static ArrayList<Fruit> getFruits(){
        return fruits;
    }
    
    private static int maxId(){
        int max = 0;
        for(Fruit fruit: fruits){
            if(fruit.getId() > max){
                max = fruit.getId();
            }
        }
        return max;
    }
    
    public static boolean create(Fruit fruit){
        for(Fruit f:fruits){
            if(f.getSpecie().equals(fruit.getSpecie())
               && f.getVariety().equals(fruit.getVariety())){
                return false;
            }
        }
        fruit.setId(maxId() + 1);
        fruits.add(fruit);
        return true;
    }
    
    public static boolean update(Fruit fruit){
        int i = 0;
        for(Fruit f:fruits){
            if(f.getId() == fruit.getId()){
                fruits.add(i, fruit);
                return true;
            }
            i++;
        }
        return false;
    }
    
    public static Fruit show(int id){
        Fruit fruit = null;
        int i = 0;
        for(Fruit f:fruits){
            if(f.getId() == id){
                fruit = fruits.get(i);
            }
        }
        return fruit;
    }
    
    public static boolean delete(int id){
        int i = 0;
        for(Fruit f:fruits){
            if(f.getId() == id){
                fruits.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
}
