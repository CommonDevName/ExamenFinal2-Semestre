package Cigarrillo;

import java.util.ArrayList;

public class Produccion {
    
    public static ArrayList <Materiales> Elaboracion = new ArrayList<>();

    public static void PicadoDeHojas(){
        Elaboracion.add(new Materiales());
        int o = Elaboracion.get(0).GetTiempo();
        for(int i = 0; i <= o; i++){
            if(i == 0){System.out.println("\nArrancando la maquina.\n");
            }else{System.out.println("Picado y desvenado " + i +".\n");}
        }
    }

    
}
