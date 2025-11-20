
package com.mycompany.veterinaria.logica;

import com.mycompany.veterinaria.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();

    public void guardar(String nombreMasco, String especie, String raza, String sexo, int edad, String alergias, String vacunas, String nombreDuenio, String celularDuenio, String observaciones) {
        //creamos el dueño y asignamos sus valores
        Dueno dueno=new Dueno();
        dueno.setNombre(nombreDuenio);
        dueno.setCelDuenio(celularDuenio);
        //creamos la mascota y asignamos sus valores
        Mascota masco=new Mascota();
        masco.setNombre(nombreMasco);
        masco.setEspecie(especie);
        masco.setRaza(raza);
        masco.setSexo(sexo);
        masco.setEdad(edad);
        masco.setAlergias(alergias);
        masco.setVacunas(vacunas);
        masco.setObservaciones(observaciones);
        masco.setUn_duenio(dueno);
        controlPersis.guardar(masco,dueno);
    }

   
    
}
