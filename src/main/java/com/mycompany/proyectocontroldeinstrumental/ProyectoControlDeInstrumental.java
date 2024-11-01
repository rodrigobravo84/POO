package com.mycompany.proyectocontroldeinstrumental;

import static com.mycompany.proyectocontroldeinstrumental.CajaDeInstrumental.buscarInstrumentoEnCajas;
import static com.mycompany.proyectocontroldeinstrumental.CajaDeInstrumental.mostrarInstrumentosDeCaja;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class ProyectoControlDeInstrumental {
    


    public static void main(String[] args) {
        
       ArrayList<String> instrumentos = new ArrayList<>();
       ArrayList<CajaDeInstrumental> cajas= new ArrayList<>();
     
       
        
       /*Creacion de obj cajaCadera con Clase CajaCadera*/
       CajaCadera cajaCadera1 = new CajaCadera();       
       cajaCadera1.setNombre("Cadera 1");
       cajaCadera1.setCantidadDeElementos(63);
       cajaCadera1.setId(1);
       cajaCadera1.instrumentos= new ArrayList<>();       
       cajaCadera1.instrumentos.add("4 Backhouse");
       cajaCadera1.instrumentos.add("2 Doyen 2do campo");
       cajaCadera1.instrumentos.add("1 Mango de bisturí 3");
       cajaCadera1.instrumentos.add("1 Mango de bisturí 4");
       cajaCadera1.instrumentos.add("1 Mango de bisturí 4 largo");
       cajaCadera1.instrumentos.add("2 Separadores Farabeuf angostos");
       cajaCadera1.instrumentos.add("2 Separadores Farabeuf anchos");
       cajaCadera1.instrumentos.add("6 Crile");
       cajaCadera1.instrumentos.add("6 Kocher");
       cajaCadera1.instrumentos.add("4 Bertolas");
       cajaCadera1.instrumentos.add("2 Porta agujas");
       cajaCadera1.instrumentos.add("1 Pasahilos");
       cajaCadera1.instrumentos.add("2 Allis");
       cajaCadera1.instrumentos.add("1 Gregoire");
       cajaCadera1.instrumentos.add("1 Foerster");
       cajaCadera1.instrumentos.add("2 Pinza de mano izquierda disección");
       cajaCadera1.instrumentos.add("1 Pinza de mano izquierda diente de ratón");
       cajaCadera1.instrumentos.add("2 Pinza de mano izquierda dientecillos");
       cajaCadera1.instrumentos.add("1 Pinza rusa");
       cajaCadera1.instrumentos.add("1 Pinza bayoneta");
       cajaCadera1.instrumentos.add("2 Tijeras Metzembaun");
       cajaCadera1.instrumentos.add("1 Tijera Mayo");
       cajaCadera1.instrumentos.add("1 Cizalla");
       cajaCadera1.instrumentos.add("2 Gubias");
       cajaCadera1.instrumentos.add("3 Escoplos");
       cajaCadera1.instrumentos.add("3 Curetas");
       cajaCadera1.instrumentos.add("2 Pinza de disco");
       cajaCadera1.instrumentos.add("1 Legras de Cobb");
       cajaCadera1.instrumentos.add("2 Legras de Frabeuf");
       cajaCadera1.instrumentos.add("2 Legras de Lambotte");
       cajaCadera1.instrumentos.add("1 Extractor de cabeza femoral");
       
       /*Creacion de obj cajaColumna con Clase CajaColumna*/
       CajaColumna cajaColumna1 = new CajaColumna();
       cajaColumna1.setNombre("Columna 1");
       cajaColumna1.setCantidadDeElementos(68);
       cajaColumna1.setId(10);
       cajaColumna1.instrumentos = new ArrayList<>();
       cajaColumna1.instrumentos.add("2 Doyen 2do campo");       
       cajaColumna1.instrumentos.add("4 Backhouse");
       cajaColumna1.instrumentos.add("2 Doyen 2do campo");
       cajaColumna1.instrumentos.add("1 Mango de bisturí 3");
       cajaColumna1.instrumentos.add("1 Mango de bisturí 4");
       cajaColumna1.instrumentos.add("1 Mango de bisturí 3 largo");
       cajaColumna1.instrumentos.add("2 Separadores Farabeuf angostos");
       cajaColumna1.instrumentos.add("2 Separadores Farabeuf anchos");
       cajaColumna1.instrumentos.add("1 Separador intercostal");
       cajaColumna1.instrumentos.add("6 Crile");
       cajaColumna1.instrumentos.add("6 Kocher");
       cajaColumna1.instrumentos.add("4 Bertolas");
       cajaColumna1.instrumentos.add("2 Porta agujas");
       cajaColumna1.instrumentos.add("1 Pasahilos");
       cajaColumna1.instrumentos.add("2 Allis");
       cajaColumna1.instrumentos.add("1 Gregoire");
       cajaColumna1.instrumentos.add("1 Foerster");
       cajaColumna1.instrumentos.add("2 Pinza de mano izquierda disección");
       cajaColumna1.instrumentos.add("1 Pinza de mano izquierda diente de ratón");
       cajaColumna1.instrumentos.add("2 Pinza de mano izquierda dientecillos");
       cajaColumna1.instrumentos.add("1 Pinza rusa");
       cajaColumna1.instrumentos.add("1 Pinza bayoneta");
       cajaColumna1.instrumentos.add("2 Tijeras Metzembaun");
       cajaColumna1.instrumentos.add("1 Tijera Mayo");
       cajaColumna1.instrumentos.add("1 Cizalla");
       cajaColumna1.instrumentos.add("2 Gubias");
       cajaColumna1.instrumentos.add("3 Escoplos");
       cajaColumna1.instrumentos.add("3 Curetas");
       cajaColumna1.instrumentos.add("4 Kerrison");
       cajaColumna1.instrumentos.add("2 Pinza de disco");
       cajaColumna1.instrumentos.add("2 Disectores");
       cajaColumna1.instrumentos.add("2 Legras de Cobb");
       cajaColumna1.instrumentos.add("2 Legras de Frabeuf");
       
       /*Creacion de obj cajaHernia con Clase CajaHernia*/
       CajaHernia cajaHernia1 = new CajaHernia();
       cajaHernia1.setNombre("Hernia 1");
       cajaHernia1.setCantidadDeElementos(35);
       cajaHernia1.setId(20);
       cajaHernia1.instrumentos= new ArrayList<>();
       cajaHernia1.instrumentos.add("4 Backhouse");
       cajaHernia1.instrumentos.add("2 Doyen 2do campo");
       cajaHernia1.instrumentos.add("1 Mango de bisturí 3");
       cajaHernia1.instrumentos.add("1 Mango de bisturí 4");
       cajaHernia1.instrumentos.add("2 Separadores Farabeuf angostos");
       cajaHernia1.instrumentos.add("2 Separadores Farabeuf anchos");
       cajaHernia1.instrumentos.add("4 Crile");
       cajaHernia1.instrumentos.add("4 Kocher");
       cajaHernia1.instrumentos.add("2 Bertolas");
       cajaHernia1.instrumentos.add("2 Porta agujas");
       cajaHernia1.instrumentos.add("1 Pasahilos");
       cajaHernia1.instrumentos.add("2 Allis");
       cajaHernia1.instrumentos.add("1 Gregoire");
       cajaHernia1.instrumentos.add("1 Foerster");
       cajaHernia1.instrumentos.add("1 Pinza de mano izquierda disección");
       cajaHernia1.instrumentos.add("1 Pinza de mano izquierda diente de ratón");
       cajaHernia1.instrumentos.add("1 Pinza de mano izquierda dientecillos");
       cajaHernia1.instrumentos.add("2 Tijeras Metzembaun");
       cajaHernia1.instrumentos.add("1 Tijera Mayo");

       
       /*Creacion de obj cajaLaparoscopia con Clase CajaCxLaparoscopica*/
       CajaCxLaparoscopica cajaLaparoscopia1 = new CajaCxLaparoscopica();
       cajaLaparoscopia1.setNombre("Laparoscopia 1");
       cajaLaparoscopia1.setCantidadDeElementos(22);
       cajaLaparoscopia1.setId(30);
       cajaLaparoscopia1.instrumentos= new ArrayList<>();
       cajaLaparoscopia1.instrumentos.add("2 Trocar 10mm");
       cajaLaparoscopia1.instrumentos.add("2 Trocar 5mm");
       cajaLaparoscopia1.instrumentos.add("1 Aguja de Veres");
       cajaLaparoscopia1.instrumentos.add("1 Tijera laparoscópica");
       cajaLaparoscopia1.instrumentos.add("2 Grasper");
       cajaLaparoscopia1.instrumentos.add("1 Pico de pato");
       cajaLaparoscopia1.instrumentos.add("1 Maryland");
       cajaLaparoscopia1.instrumentos.add("1 Clipadora laparoscópica");
       cajaLaparoscopia1.instrumentos.add("1 Pinza extractora");
       cajaLaparoscopia1.instrumentos.add("1 Hook");
       cajaLaparoscopia1.instrumentos.add("1 Cable de Hook");
       cajaLaparoscopia1.instrumentos.add("1 Pinza bipolar");
       cajaLaparoscopia1.instrumentos.add("1 Cable de pinza bipolar");
       cajaLaparoscopia1.instrumentos.add("1 Baja hilos");
       cajaLaparoscopia1.instrumentos.add("2 Pinza de biopsia");
       cajaLaparoscopia1.instrumentos.add("2 Porta agujas laparoscópico");
       cajaLaparoscopia1.instrumentos.add("1 Doble utilidad");
       
       /*Creacion de obj cajaMama con Clase CajaMama*/
       CajaMama cajaMama1= new CajaMama();
       cajaMama1.setNombre("Mama 1");
       cajaMama1.setCantidadDeElementos(45);
       cajaMama1.setId(40);
       cajaMama1.instrumentos= new ArrayList<>();
       cajaMama1.instrumentos.add("4 Backhouse");
       cajaMama1.instrumentos.add("2 Doyen 2do campo");
       cajaMama1.instrumentos.add("2 Mango de bisturí 3");
       cajaMama1.instrumentos.add("2 Mango de bisturí 4");
       cajaMama1.instrumentos.add("2 Separadores Farabeuf angostos");
       cajaMama1.instrumentos.add("2 Separadores Farabeuf anchos");
       cajaMama1.instrumentos.add("2 Separadores oblícuos");
       cajaMama1.instrumentos.add("6 Crile");
       cajaMama1.instrumentos.add("4 Kocher");
       cajaMama1.instrumentos.add("2 Bertolas");
       cajaMama1.instrumentos.add("2 Porta agujas");
       cajaMama1.instrumentos.add("1 Pasahilos");
       cajaMama1.instrumentos.add("4 Allis");
       cajaMama1.instrumentos.add("1 Gregoire");
       cajaMama1.instrumentos.add("1 Foerster");
       cajaMama1.instrumentos.add("1 Pinza de mano izquierda disección");
       cajaMama1.instrumentos.add("1 Pinza de mano izquierda diente de ratón");
       cajaMama1.instrumentos.add("1 Pinza de mano izquierda dientecillos");
       cajaMama1.instrumentos.add("1 Pinza de mano izquierda Adson con dientes");
       cajaMama1.instrumentos.add("1 pinza de mano izquierda Adson sin dientes");
       cajaMama1.instrumentos.add("2 Tijeras Metzembaun");
       cajaMama1.instrumentos.add("1 Tijera Mayo");
       
       /*Creacion de obj cajaLaparotomia con Clase CajaLaparotomiaGinecologica*/
       CajaLaparotomiaGinecologica cajaLaparotomia1 = new CajaLaparotomiaGinecologica();
       cajaLaparotomia1.setNombre("Laparotomia Ginecologica 1");
       cajaLaparotomia1.setCantidadDeElementos(69);
       cajaLaparotomia1.setId(50);
       cajaLaparotomia1.instrumentos= new ArrayList<>();
       cajaLaparotomia1.instrumentos.add("4 Backhouse");
       cajaLaparotomia1.instrumentos.add("2 Doyen 2do campo");
       cajaLaparotomia1.instrumentos.add("1 Mango de bisturí 3");
       cajaLaparotomia1.instrumentos.add("1 Mango de bisturí 4");
       cajaLaparotomia1.instrumentos.add("1 Mango de bisturí 2 margo");
       cajaLaparotomia1.instrumentos.add("2 Separadores Farabeuf angostos");
       cajaLaparotomia1.instrumentos.add("2 Separadores Farabeuf anchos");
       cajaLaparotomia1.instrumentos.add("2 Separadores oblícuos");
       cajaLaparotomia1.instrumentos.add("3 Valvas de Doyen");
       cajaLaparotomia1.instrumentos.add("1 Valva maleable");
       cajaLaparotomia1.instrumentos.add("1 Valva suprapúbica");
       cajaLaparotomia1.instrumentos.add("6 Crile");
       cajaLaparotomia1.instrumentos.add("6 Kocher");
       cajaLaparotomia1.instrumentos.add("2 Erina");
       cajaLaparotomia1.instrumentos.add("4 Faure");
       cajaLaparotomia1.instrumentos.add("4 Bertolas");
       cajaLaparotomia1.instrumentos.add("3 Porta agujas");
       cajaLaparotomia1.instrumentos.add("2 Pasahilos");
       cajaLaparotomia1.instrumentos.add("4 Allis");
       cajaLaparotomia1.instrumentos.add("2 Gregoire");
       cajaLaparotomia1.instrumentos.add("2 Foerster");
       cajaLaparotomia1.instrumentos.add("2 Pinza de aro");
       cajaLaparotomia1.instrumentos.add("2 Pinza de mano izquierda disección");
       cajaLaparotomia1.instrumentos.add("1 Pinza de mano izquierda diente de ratón");
       cajaLaparotomia1.instrumentos.add("2 Pinza de mano izquierda dientecillos");
       cajaLaparotomia1.instrumentos.add("1 Pinza de mano izquierda Backey");
       cajaLaparotomia1.instrumentos.add("1 Pinza de mano izquierda rusa");
       cajaLaparotomia1.instrumentos.add("3 Tijeras Metzembaun");
       cajaLaparotomia1.instrumentos.add("2 Tijera Mayo");
       
       /*Se agregan las cajas creadas al ArrayList de cajas */
       cajas.add(cajaCadera1);  
       cajas.add(cajaColumna1);
       cajas.add(cajaMama1);
       cajas.add(cajaLaparotomia1);
       cajas.add(cajaLaparoscopia1);
       cajas.add(cajaHernia1);
       
       /*Acá va el login*/
       
        /*Opciones */
        System.out.println("Elija una opcion para la tarea a realizar");
        System.out.println("1. Buscar instrumental específico");
        System.out.println("2. Buscar listado de instrumental de una caja específica");
        System.out.println("3. Realizar conteo de instrumental");
        Scanner sc0 = new Scanner (System.in);
        int opcion = sc0.nextInt();
        String resp;
        int totalDeElementos=0;
        
        /*Creacion de switch para eleccion de opciones*/
        switch (opcion){
        /*Buscador de instrumental dentro de la caja*/
            case 1: 
                    do{
                        System.out.println("Ingrese instrumental :");    
                        Scanner sc = new Scanner (System.in);
                        String elementoBuscado= sc.nextLine();
                        buscarInstrumentoEnCajas(elementoBuscado, cajas);
                        System.out.println("-------------------------------------------------------");
                        System.out.println("¿Desea buscar otro instrumental? s para si o n para no");
                        Scanner sc4 = new Scanner (System.in);
                        resp = sc4.nextLine();           
                    }while(resp.equalsIgnoreCase("s"));
                    
                     break;    
                    
                   
        /*Buscador de lista de instrumental por caja*/
            case 2:
                    do {
                        System.out.println("Ingrese nombre de caja");
                        Scanner sc1 = new Scanner (System.in);
                        String cajaBuscada = sc1.nextLine();
                        mostrarInstrumentosDeCaja(cajaBuscada, cajas);
                        System.out.println("-------------------------------------------------------");
                        System.out.println("¿Desea ver listado de otra caja? s para si o n para no");
                        Scanner sc4 = new Scanner (System.in);
                        resp = sc4.nextLine();           
                        }while(resp.equalsIgnoreCase("s"));
                        break;
                    
                    
        /*Contador de materiales para cierre de cirugia*/            
            case 3: do{
                        
                        System.out.println("Ingrese nombre de caja");    
                        Scanner sc2 = new Scanner (System.in);
                        String caja = sc2.nextLine();
                        System.out.println("Ingrese cantidad de instrumental");
                        Scanner sc3 = new Scanner (System.in);
                        int cantDeInstrumental = sc3.nextInt();
                        totalDeElementos = totalDeElementos + cantDeInstrumental;
                        System.out.println("-------------------------------------------------------");
                        System.out.println("¿Desea agregar otra caja de instrumental? s para si o n para no");
                        Scanner sc4 = new Scanner (System.in);
                        resp = sc4.nextLine();                        
;                       }while (resp.equalsIgnoreCase("s"));
;                       System.out.println("Total de elementos en todas las cajas seleccionadas es de: " + totalDeElementos);   
                        System.out.println("Solicite conteo al instrumentador/a"); 
                        Scanner sc5 = new Scanner (System.in);
                        int contInstrumentador = sc5.nextInt();
                        
                        if (contInstrumentador == totalDeElementos){
                            System.out.println("Conteo de instrumental correcto");
                        }else{
                            System.out.println("Conteo de instrumental incorrecto");
                            System.out.println("Faltan " + (totalDeElementos - contInstrumentador) + " elementos");
                            System.out.println("Solicitar control radioscopico. Avise a Coordinación");
                        }         
                     break;
                    
                    
            default: System.out.println("Opcion incorrecta");
                    
                    
                    
       }   
       
            
    } 
       
    
}
        