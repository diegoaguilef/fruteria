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
public class Client {
  private String rut;
  private String name;
  private String enterprise;
  private String address;
  private String logo;

  /**
   *
   * @param rut
   * @param nombre
   * @param enterprise
   * @param address
   * @param logo
   */
  public Client(String rut, String name, String enterprise, String address, String logo) {
    this.rut = rut;
    this.name = name;
    this.enterprise = enterprise;
    this.address = address;
    this.logo = logo;
  }

 
  /**
   *
   */
  public Client() {
  }

  /**
   *
   * @return
   */
  public String getRut() {
    return rut;
  }

  /**
   *
   * @param rut
   */
  public void setRut(String rut) {
    this.rut = rut;
  }

  /**
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param nombre
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return
   */
  public String getEnterprise() {
    return enterprise;
  }

  /**
   *
   * @param enterprise
   */
  public void setEnterprise(String enterprise) {
    this.enterprise = enterprise;
  }

  /**
   *
   * @return
   */
  public String getAddress() {
    return address;
  }

  /**
   *
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   *
   * @return
   */
  public String getLogo() {
    return logo;
  }

  /**
   *
   * @param logo
   */
  public void setLogo(String logo) {
    this.logo = logo;
  }

  @Override
  public String toString() {
    return "Cliente: " + "Rut: " + rut + 
      ", Nombre: " + name + 
      ", Empresa: " + enterprise + 
      ", Dirección: " + address + 
      ", Logo: " + logo;
  }
  
}
