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
  private String photo;

  /**
   *
   */
  public Fruit() {
  }
  
  /**
   *
   * @param farm
   * @param specie
   * @param variety
   * @param price
   * @param stock
   * @param photo
   */
  public Fruit(String farm, String specie, String variety, int price, int stock, String photo) {
    this.farm = farm;
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
  public String getFarm() {
    return farm;
  }

  /**
   *
   * @param farm
   */
  public void setFarm(String farm) {
    this.farm = farm;
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

  @Override
  public String toString() {
    return "Fruit{" + "id=" + id + ", farm=" + farm + ", specie=" + specie + ", variety=" + variety + ", price=" + price + ", stock=" + stock + '}';
  }
}
