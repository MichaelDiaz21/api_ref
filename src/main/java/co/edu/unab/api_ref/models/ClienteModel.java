package co.edu.unab.api_ref.models;

import org.springframework.data.annotation.Id;

public class ClienteModel {

    @Id
    private String id;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Long precio;
    private int cantidad;
    private boolean disponibilidad;


    public ClienteModel(){

    }

    
    public ClienteModel(String id, String categoria, String nombre, String descripcion, Long precio, int cantidad,
            boolean disponibilidad) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Long getPrecio() {
        return precio;
    }


    public void setPrecio(Long precio) {
        this.precio = precio;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public boolean isDisponibilidad() {
        return disponibilidad;
    }


    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }   

    
}

