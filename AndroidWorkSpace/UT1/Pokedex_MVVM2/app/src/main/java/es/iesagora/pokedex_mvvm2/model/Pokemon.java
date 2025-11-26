package es.iesagora.pokedex_mvvm2.model;

import java.io.Serializable;
import java.util.Objects;

public class Pokemon implements Serializable {

    private int numero;
    private String nombre;
    private int image;
    private String detalles;
    private int generacion;
    private String tipo1;
    private String tipo2;
    private Boolean favorito;

    public Pokemon(int numero, String nombre, int image, String detalles,
                   int generacion, String tipo1, String tipo2, Boolean favorito) {

        this.numero = numero;
        this.nombre = nombre;
        this.image = image;
        this.detalles = detalles;
        this.generacion = generacion;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.favorito = favorito;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImage() {
        return image;
    }

    public String getDetalles() {
        return detalles;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pokemon)) return false;

        Pokemon p = (Pokemon) o;

        return numero == p.numero &&
                image == p.image &&
                generacion == p.generacion &&
                Objects.equals(nombre, p.nombre) &&
                Objects.equals(detalles, p.detalles) &&
                Objects.equals(tipo1, p.tipo1) &&
                Objects.equals(tipo2, p.tipo2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nombre, image, detalles, generacion, tipo1, tipo2);
    }
}
