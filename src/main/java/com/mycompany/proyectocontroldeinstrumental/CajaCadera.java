package com.mycompany.proyectocontroldeinstrumental;

import java.util.ArrayList;

public class CajaCadera extends CajaDeInstrumental {

    public CajaCadera() {
    }

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
        System.out.println("Esta caja cuenta con material oseo");
       
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

