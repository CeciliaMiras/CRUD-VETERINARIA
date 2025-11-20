
package com.mycompany.veterinaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int num_cliente;
    private String nombre;
    private String especie;
    private String raza;
    private String sexo;
    private int edad;
    private String alergias;
    private String vacunas;
    private String observaciones;
    @OneToOne
    private Dueno un_duenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String especie, String raza, String sexo, int edad, String alergias, String vacunas, String observaciones, Dueno un_duenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.alergias = alergias;
        this.vacunas = vacunas;
        this.observaciones = observaciones;
        this.un_duenio = un_duenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueno getUn_duenio() {
        return un_duenio;
    }

    public void setUn_duenio(Dueno un_duenio) {
        this.un_duenio = un_duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente=" + num_cliente + ", nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", alergias=" + alergias + ", vacunas=" + vacunas + ", observaciones=" + observaciones + ", un_duenio=" + un_duenio + '}';
    }
    
}
