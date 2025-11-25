package com.mycompany.veterinaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private int num_cliente;

    private String nombre;
    private String especie;
    private String raza;
    private String sexo;        // "M" o "F"
    private int edad;
    private String alergias;    // "SI" o "NO"
    private String vacunas;     // "SI" o "NO"
    private String observaciones;

    @ManyToOne
    private Dueno un_duenio;

    // Constructor vacío (OBLIGATORIO para JPA)
    public Mascota() {
    }

    // Getters y setters
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
        // Aseguramos que solo quede "M" o "F"
        if (sexo != null) {
            sexo = sexo.trim().toUpperCase();
            if (sexo.equals("M") || sexo.equals("F")) {
                this.sexo = sexo;
            } else {
                this.sexo = "M"; // Valor por defecto si viene mal
            }
        } else {
            this.sexo = "M";
        }
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
        // Solo "SI" o "NO"
        if (alergias != null) {
            alergias = alergias.trim().toUpperCase();
            this.alergias = alergias.equals("SI") ? "SI" : "NO";
        } else {
            this.alergias = "NO";
        }
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        // Solo "SI" o "NO"
        if (vacunas != null) {
            vacunas = vacunas.trim().toUpperCase();
            this.vacunas = vacunas.equals("SI") ? "SI" : "NO";
        } else {
            this.vacunas = "NO";
        }
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
}

