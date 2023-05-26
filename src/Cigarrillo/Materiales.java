package Cigarrillo;

import java.util.Arrays;

public class Materiales {
    
    private int[] matricula = {0,7,0,7,1,5};
    private int Hojas;
    private int Tiempo;
    private int Aroma;
    private int Azucar;
    private int Nicotina;

    public Materiales(){
        this.Hojas = (matricula[4]*10) + matricula[5];
        this.Tiempo = matricula[4] + matricula[5];
        this.Aroma = (matricula[0]*10) + matricula[1];
        this.Azucar = (matricula[2]*10) + matricula[3];
        this.Nicotina = matricula[0] + matricula[5];
    }

    public int GetHojas(){
        return Hojas;
    }

    public int GetTiempo(){
        return Tiempo;
    }

    public int GetAroma(){
        return Aroma;
    }

    public int GetAzucar(){
        return Azucar;
    }

    public int GetNicotina(){
        return Nicotina;
    }
}
