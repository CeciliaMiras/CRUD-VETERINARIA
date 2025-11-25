
package com.mycompany.veterinaria.logica;

import com.mycompany.veterinaria.persistencia.ControladoraPersistencia;
import com.mycompany.veterinaria.persistencia.DuenoJpaController;
import java.util.List;


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
        masco.setUn_duenio(dueno);
        masco.setObservaciones(observaciones);
        controlPersis.guardar(masco,dueno);
    }

  

    public List<Mascota> traerMascota() {
      return controlPersis.traerMascota();
    }

    public void borrarMasocta(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String especie, String raza, String sexo, int edad, String alergias, String vacunas, String nombreDuenio, String celularDuenio, String observaciones) {
        masco.setNombre(nombreMasco);
        masco.setEspecie(especie);
        masco.setRaza(raza);
        masco.setSexo(sexo);
        masco.setEdad(edad);
        masco.setAlergias(alergias);
        masco.setVacunas(vacunas);
        controlPersis.modificarMascota(masco);
        Dueno dueno=this.buscarDueno(masco.getUn_duenio().getId_duenio());
        dueno.setCelDuenio(celularDuenio);
        dueno.setNombre(nombreDuenio);
        //llamar a modificar dueño
        this.modificarDueno(dueno);
    }

    private Dueno buscarDueno(int id_duenio) {
       return controlPersis.traerDueno(id_duenio);
    }

    private void modificarDueno(Dueno dueno) {
        controlPersis.modificarDueno(dueno);
    }

   

    

   
    
}
