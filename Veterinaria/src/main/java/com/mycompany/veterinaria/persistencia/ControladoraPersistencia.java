
package com.mycompany.veterinaria.persistencia;

import com.mycompany.veterinaria.logica.Dueno;
import com.mycompany.veterinaria.logica.Mascota;


public class ControladoraPersistencia {
    DuenoJpaController duenoJpa= new DuenoJpaController();
    MascotaJpaController mascotaJpa=new MascotaJpaController();

    public void guardar(Mascota masco, Dueno dueno) {
        //crear la base de datos de dueño
        duenoJpa.create(dueno);
        //crear la base de datos mascota
        mascotaJpa.create(masco);
    }
    
}
