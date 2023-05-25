package Cigarrillo;

public class Materiales {
    
    public static int matricula = 070715;
    public int Hojas;
    public int Tiempo;
    public int Aroma;
    public int Azucar;
    public int Nicotina;

    public Materiales(){}

    public void SetHojas(){
        this.Hojas = 15;
    }

    public int GetHojas(){
        return Hojas;
    }

    public void SetTiempo(){
        this.Tiempo = 1+5;
    }

    public int GetTiempo(){
        return Tiempo;
    }

    public void SetAroma(){
        this.Aroma = 7;
    }

    public int GetAroma(){
        return Aroma;
    }

    public void SetAzucar(){
        this.Azucar = 7;
    }

    public int GetAzucar(){
        return Azucar;
    }

    public void SetNicotina(){
        this.Nicotina = 0+5;
    }

    public int GetNicotina(){
        return Nicotina;
    }
}
