package Cigarrillo;

import java.util.ArrayList;


public class Produccion {
    
    public static ArrayList <Materiales> Elaboracion = new ArrayList<>();
    public static int cigarrillos;
    public static int cigarrillosSueltos;
    public static int tipoDePaquete;
    public static int paquetes;

    public static void PicadoDeHojas(){
        Elaboracion.add(new Materiales());
        int o = Elaboracion.get(0).GetTiempo();
        for(int i = 0; i <= o; i++){
            if(i == 0){System.out.println("\nArrancando la maquina.\n");
            }else{System.out.println("Picado y desvenado " + i +".\n");}
        }
    }

    public static void CigarrillosResultantes(){
        cigarrillos = Elaboracion.get(0).GetHojas() +
                      Elaboracion.get(0).GetTiempo() +
                      Elaboracion.get(0).GetAroma() +
                      Elaboracion.get(0).GetAzucar() +
                      Elaboracion.get(0).GetNicotina();
    }

    public static void Empaquetado(){
        tipoDePaquete = (Materiales.matricula[5] % 2 == 0)?14:20;
        cigarrillosSueltos = cigarrillos;
        int i = 0;
        while(cigarrillosSueltos >= tipoDePaquete){
            cigarrillosSueltos = cigarrillosSueltos - tipoDePaquete;
            i++;
            System.out.println("Empaquetado "+ i +".\n");
        }
        paquetes = i;
    }

    public static void ProcesoDeProduccion(){
        PicadoDeHojas();
        CigarrillosResultantes();
        Empaquetado();
        System.out.println("\nProceso finalizado.\n\n"+
                           "Total de cigarrilos producidos: "+ cigarrillos +"\n"+
                           "Paquetes producidos "+"("+ tipoDePaquete +"): "+ paquetes +"\n"+
                           "Cigarrillos Sueltos: "+ cigarrillosSueltos);
    }
}
