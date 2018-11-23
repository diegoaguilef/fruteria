/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria.ui.app.model;

import java.util.Date;

/**
 *
 * @author kdieg
 */
public class Sales {
  private int id;
  private Fruit fruit;
  private Client client;
  private Date date;
  private int quantity;
  private int totalPrice;

  /**
   *
   */
  public Sales() {
  }

  /**
   *
   * @param fruit
   * @param client
   * @param quantity
   * @param totalPrice
   */
  public Sales(Fruit fruit, Client client, Date date, int quantity, int totalPrice) {
        this.fruit = fruit;
        this.client = client;
        this.date = date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
  }

    /**
     *
     * @return
     */
    public Fruit getFruit() {
        return fruit;
    }

  /**
   *
   * @param fruit
   */
  public void setFruit(Fruit fruit) {
    this.fruit = fruit;
  }

  /**
   *
   * @return
   */
  public Client getClient() {
    return client;
  }

  /**
   *
   * @param client
   */
  public void setClient(Client client) {
    this.client = client;
  }

  /**
   *
   * @return
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   *
   * @param quantity
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   *
   * @return
   */
  public int getTotalPrice() {
    return totalPrice;
  }

  /**
   *
   * @param totalPrice
   */
  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
  }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

  @Override
  public String toString() {
    return "Sales{" + "id=" + id + ", fruit=" + fruit + ", client=" + client + ", quantity=" + quantity + ", totalPrice=" + totalPrice + '}';
  }
  
}
