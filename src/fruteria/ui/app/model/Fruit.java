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
  private String specie;
  private String variety;
  private int price;
  private int stock;
  private String photo;

  /**
   *
   */
  public Fruit() {
  }
  
  /**
   *
   * @param specie
   * @param variety
   * @param price
   * @param stock
   * @param photo
   */
  public Fruit(String specie, String variety, int price, int stock, String photo) {
    this.specie = specie;
    this.variety = variety;
    this.price = price;
    this.stock = stock;
    this.photo = photo;
  }
  
  /**
   *
   * @param id
   * @param specie
   * @param variety
   * @param price
   * @param stock
   * @param photo
   */
  public Fruit(int id, String specie, String variety, int price, int stock, String photo) {
    this.id = id;
    this.specie = specie;
    this.variety = variety;
    this.price = price;
    this.stock = stock;
    this.photo = photo;
  }

  /**
   *
   * @return
   */
  public String getSpecie() {
    return specie;
  }

  /**
   *
   * @param specie
   */
  public void setSpecie(String specie) {
    this.specie = specie;
  }

  /**
   *
   * @return
   */
  public String getVariety() {
    return variety;
  }

  /**
   *
   * @param variety
   */
  public void setVariety(String variety) {
    this.variety = variety;
  }

  /**
   *
   * @return
   */
  public int getPrice() {
    return price;
  }

  /**
   *
   * @param price
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   *
   * @return
   */
  public int getStock() {
    return stock;
  }

  /**
   *
   * @return
   */
  public int getId() {
        return id;
    }

  /**
   *
   * @param id
   */
  public void setId(int id) {
        this.id = id;
    }

  /**
   *
   * @return
   */
  public String getPhoto() {
        return photo;
    }

  /**
   *
   * @param photo
   */
  public void setPhoto(String photo) {
        this.photo = photo;
    }

  /**
   *
   * @param stock
   */
  public void setStock(int stock) {
    this.stock = stock;
  }
  
  public String getName(){
    return specie + " " + variety;
  }

  @Override
  public String toString() {
    return "Fruta " + "id:" + id + 
      ", Especie: " + specie + 
      ", Variedad: " + variety +  
      ", Precio: " + price + 
      ", Stock:" + stock;
  }
}
