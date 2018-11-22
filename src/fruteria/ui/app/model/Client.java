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
  private String nombre;
  private int telefono;

  /**
   *
   * @param rut
   * @param nombre
   * @param telefono
   */
  public Client(String rut, String nombre, int telefono) {
    this.rut = rut;
    this.nombre = nombre;
    this.telefono = telefono;
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
  public String getNombre() {
    return nombre;
  }

  /**
   *
   * @param nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   *
   * @return
   */
  public int getTelefono() {
    return telefono;
  }

  /**
   *
   * @param telefono
   */
  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Client{" + "rut=" + rut + ", nombre=" + nombre + ", telefono=" + telefono + '}';
  }
  
}
