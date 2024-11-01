package com.mycompany.proyectocontroldeinstrumental;

import java.util.ArrayList;

public class CajaMama extends CajaDeInstrumental{

    @Override
    public void mostrarNombre() {
        System.out.println(getNombre());
    }

    @Override
    public void mostrarCant() {
        System.out.println(getCantidadDeElementos());
    }

    @Override
    public void mostrarDescripcion() {
         System.out.println("Esta caja cuenta con material oseo y delicado");
    }

    public boolean contieneInstrumento(String instrumento) {
        for (String detalle : instrumentos) {
            if (detalle.contains(instrumento)) {
                return true;
            }
        }
        return false;
   
    
     }
 
}