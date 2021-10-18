package Modelo;


import java.io.Serializable;

public class Pro implements Serializable{
    private String nombre;
    private String cantidad;
    private String id;
    private String precio;
    private String urlImage;

    public Pro() {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.id = id;
        this.precio = precio;
        this.urlImage = urlImage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
