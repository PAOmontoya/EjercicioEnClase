package com.mycompany.ejercicioenclase;

public class CuentaBancaria {
    String nombre;
    double saldo;
    
    //rest
    public CuentaBancaria(String nombre, double saldo){
        this.nombre=nombre;
        this.saldo=saldo;  
    }
    
    public void depositar(double cantidad){
        saldo=+cantidad;
    }
    
    public void retirar(double cantidad){
        saldo=-cantidad;
     //exception here   
    }
    
    public String getName(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
