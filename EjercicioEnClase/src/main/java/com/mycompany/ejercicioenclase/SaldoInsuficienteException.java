
package com.mycompany.ejercicioenclase;

/**
 *
 * @author telip
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String errorMESSAGE){
        super (errorMESSAGE);
       
    }
    
    public boolean check(double saldo, double retirar){
        if(saldo<retirar){
            return false;
        }else{
            return true;
        }
    }
}
