/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double precios;
    private boolean activo;

    public Producto(int id, String nombre, int cantidad, double precios, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precios = precios;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precios=").append(precios);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

   



}
