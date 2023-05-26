package examenfinal2semestre;

import java.util.Scanner;
import Cigarrillo.Produccion;
import Author.Info;

public class Execution {
    
    public static Scanner dataInput = new Scanner(System.in);

    public static void AppExecution(){
        Menu();
    }

    public static void MenuText(){
        System.out.println("\nElija una Opcion.\n\n"+
                           "Produccion de cigarrillos. (1)\n"+
                           "Datos del autor del script. (2)\n"+
                           "Salir. (0)\n");
    }

    public static void Menu(){
        int election;
        boolean condition = true;
        do{
            MenuText();
            election = dataInput.nextInt();
            switch(election){
                case 1 -> {Produccion.ProcesoDeProduccion();
                           }
                case 2 -> {Info.Author070715();}
                case 0 -> {condition = false;}
            }
        }while(condition);
    }
}
