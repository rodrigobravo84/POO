package com.mycompany.proyectocontroldeinstrumental;

import java.util.ArrayList;

/*Creacion de clase abstracta*/
public abstract class CajaDeInstrumental {
    /*Creacion de atributos*/
    protected String nombre;
    protected int id;
    protected int cantidadDeElementos;   
    protected ArrayList<String> instrumentos;
    
   
    
    /*Creacion de constructor vacio*/
    protected CajaDeInstrumental() {
    }
    
    /*Creacion de constructor con parametros*/
    protected CajaDeInstrumental(String nombre, int id, int cantidadDeElementos,ArrayList<String> instrumentos ) {
        this.nombre = nombre;
        this.id = id;
        this.cantidadDeElementos = cantidadDeElementos;        
        this.instrumentos = new ArrayList<>();
    }
    /* Creacion de getters y setters*/
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadDeElementos() {
        return cantidadDeElementos;
    }

    public void setCantidadDeElementos(int cantidadDeElementos) {
        this.cantidadDeElementos = cantidadDeElementos;
    }

    public ArrayList<String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(ArrayList<String> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
      
       
    /*Creacion de metodos*/
    public abstract void mostrarNombre();
    public abstract void mostrarCant();
    public abstract void mostrarDescripcion();
    
    
    public boolean contieneInstrumento(String instrumento) {
        for (String detalle : instrumentos) {
            if (detalle.contains(instrumento)) {
                return true;
            }
        }
        return false;    
     }
    public static void buscarInstrumentoEnCajas(String instrumento, ArrayList<CajaDeInstrumental> cajas) {
        boolean encontrado = false;
        System.out.println("Buscando el instrumento \"" + instrumento + "\" en las cajas:");

        for (CajaDeInstrumental caja : cajas) {
            for (String detalle : caja.getInstrumentos()) {
                if (detalle.toLowerCase().contains(instrumento.toLowerCase())) {
                    System.out.println("Se encuentran \"" + detalle + "\"  en la caja: " + caja.getNombre());
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El instrumento \"" + instrumento + "\" no se encontró en ninguna caja.");
        }
    
    
    }
    public static void mostrarInstrumentosDeCaja(String nombreCaja, ArrayList<CajaDeInstrumental> cajas) {
    boolean cajaEncontrada = false;
    for (CajaDeInstrumental caja : cajas) {
        if (caja.getNombre().equalsIgnoreCase(nombreCaja)) { // Comparación insensible a mayúsculas
            System.out.println("Caja seleccionada: " + caja.getNombre());
            System.out.println("Instrumentos:");
            if (caja.getInstrumentos().isEmpty()) {
                System.out.println("  - No hay instrumentos en esta caja.");
            } else {
                for (String instrumento : caja.getInstrumentos()) {
                    System.out.println("  - " + instrumento);
                }
            }
            cajaEncontrada = true;
            break;
        }
    }
    if (!cajaEncontrada) {
        System.out.println("La caja con el nombre \"" + nombreCaja + "\" no se encontró.");
    }

    
    
   }
}

