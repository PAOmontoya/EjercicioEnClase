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
        double saldoTOTAL=0;
        CuentaBancaria cuentaB;
        
        while(!menu.equals("4")){  
            System.out.println("1) Crear Cuenta \n"
                + "2) Realizar operaciones \n"
                + "3) Consultar saldo total\n"
                + "4) Salir");
        
        menu=sc.next();
        
        switch (menu){
            case"1":
                System.out.println("Ingrese su nombre: ");
                String nombre=sc.next();
                
                System.out.println("Ingrese su saldo inicial: ");
                 double saldoI=sc.nextDouble();
                 
                cuentaB= new CuentaBancaria(nombre,saldoI);
                 CuentaBancaria.nombres.add(nombre);
                 CuentaBancaria.saldos.add(saldoI);
                break;
                
            case "2"://realiaz operaciones
                if(!CuentaBancaria.nombres.isEmpty()){
                    for(int i =0;i<CuentaBancaria.nombres.size();i++){
                        System.out.println("Cuenta #"+(i+1)+" Nombre: "+CuentaBancaria.nombres.get(i)+
                                "  Saldo: "+CuentaBancaria.saldos.get(i));  
                    }
                    System.out.println("\n Elija una cuenta:");
                int select=(sc.nextInt())-1;
                
                if(select>CuentaBancaria.nombres.size() || select<0){
                    System.out.println("Opcion fuera del limite");
                }else{
                    //submenu
                    System.out.println("1) retirar \n"
                            + "2) agregar");
                   String option=sc.next();
                   
                   switch(option){
                       case "1":
                           System.out.println("Ingrese la cantidad:");
                           double cantidad=sc.nextDouble();
                           
                           
                           
                           
                           break;
                   }//submenu
                }
                }else{
                    System.out.println("No existe ninguna cuenta");
                }
                
                
                
    
                break;
            
                case"3":
                    for(int i =0; i<CuentaBancaria.saldos.size();i++){
                        saldoTOTAL+=CuentaBancaria.saldos.get(i);
                    }
                    
                    System.out.println("Saldo total: "+saldoTOTAL);
                    
                    break;
            
        }
            
        }//close  
    }//main
}
