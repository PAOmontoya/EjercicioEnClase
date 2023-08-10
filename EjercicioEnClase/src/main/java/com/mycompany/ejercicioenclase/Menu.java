package com.mycompany.ejercicioenclase;
import java.util.Scanner;
/**
 *
 * @author telip
 */
public class Menu {
    static Scanner sc= new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[]args){
        String menu="0";
        
        while(!menu.equals("4")){  
            System.out.println("1) Crear Cuenta \n"
                + "2) Realizar operaciones \n"
                + "3)  Consultar saldo total\n"
                + "4) Salir");
        
        menu=sc.next();
        
        switch (menu){
            case"1":
                System.out.println("Ingrese su nombre: ");
                String nombre=sc.next();
                
                System.out.println("Ingrese su saldo inicial: ");
                 double saldoI=sc.nextDouble();
                 
                CuentaBancaria cuentaB= new CuentaBancaria(nombre,saldoI);
                 globals.Cuentas.add(cuentaB);
                break;
                
            case "2"://realiaz operaciones
                if(globals.Cuentas.isEmpty()){
                    System.out.println("No existe ninguna cuenta");
                }else{
                    for(int i=0;i<globals.Cuentas.size();i++){
                        System.out.println(globals.Cuentas.get(i)); 
                    }
                }
    
                break;
            
                case"3":
                    
                    break;
            
        }
            
        }//close  
    }//main
}
