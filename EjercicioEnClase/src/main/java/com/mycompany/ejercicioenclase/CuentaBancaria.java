package com.mycompany.ejercicioenclase;

import java.util.ArrayList;

public class CuentaBancaria {
    String nombre;
    double saldo;
    double saldoTotal;
    public static ArrayList<String> nombres= new ArrayList<String>(); 
    public static ArrayList<Double> saldos= new ArrayList<Double>();
    
    //rest
    public CuentaBancaria(String nombre, double saldo){
        this.nombre=nombre;
        this.saldo=saldo;  
    }
    
    public void depositar(double cantidad, CuentaBancaria cuenta){
        
    }
    
    public void retirar(double cantidad){
        saldo-=cantidad;
     //exception here   
    }
    
    public String getName(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double cantidad){
        saldo=cantidad;
    }
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
}
