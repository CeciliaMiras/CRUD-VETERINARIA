
package com.mycompany.veterinaria.persistencia;

import com.mycompany.veterinaria.logica.Dueno;
import com.mycompany.veterinaria.logica.Mascota;
import com.mycompany.veterinaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    DuenoJpaController duenoJpa= new DuenoJpaController();
    MascotaJpaController mascotaJpa=new MascotaJpaController();

    public void guardar(Mascota masco, Dueno dueno) {
        //crear la base de datos de dueño
        duenoJpa.create(dueno);
        //crear la base de datos mascota
        mascotaJpa.create(masco);
    }

    public List<Mascota> traerMascota() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return mascotaJpa.findMascota(num_cliente);
    }

   

    public Dueno traerDueno(int id_duenio) {
        return duenoJpa.findDueno(id_duenio);
    }

    public void modificarDueno(Dueno dueno) {
        try {
            duenoJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   

   
    }
    

