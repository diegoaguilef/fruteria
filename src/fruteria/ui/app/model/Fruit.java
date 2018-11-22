/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.model;

/**
 *
 * @author kdieg
 */
public class Fruit {
  private int id;
  private String farm;
  private String specie;
  private String variety;
  private int price;
  private int stock;

  public Fruit() {
  }
  
  public Fruit(String farm, String specie, String variety, int price, int stock) {
    this.farm = farm;
    this.specie = specie;
    this.variety = variety;
    this.price = price;
    this.stock = stock;
  }

  public String getFarm() {
    return farm;
  }

  public void setFarm(String farm) {
    this.farm = farm;
  }

  public String getSpecie() {
    return specie;
  }

  public void setSpecie(String specie) {
    this.specie = specie;
  }

  public String getVariety() {
    return variety;
  }

  public void setVariety(String variety) {
    this.variety = variety;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Fruit{" + "id=" + id + ", farm=" + farm + ", specie=" + specie + ", variety=" + variety + ", price=" + price + ", stock=" + stock + '}';
  }
}
