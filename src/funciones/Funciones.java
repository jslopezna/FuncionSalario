/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.Scanner;
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEnt = new Scanner (System.in);
        String nombre = null;
        double valorHora = 0;
        double  ValorPagar = 0;
        int numHoras = 0;
        double valorPagar= 0; 
        //Lectura datos
        System.out.println("Nombre:");
        nombre=flujoEnt.next();
        
        System.out.println("Horas Trabajadas");
        numHoras=flujoEnt.nextInt();
        
        System.out.println("Valor Hora:");
        valorHora=flujoEnt.nextDouble();
       valorPagar = Dinero (numHoras,valorHora);
       System.out.println("Nombre "+ nombre+ "pago " + valorPagar);
       
    }
    /**
     * 
     * @param horas
     * @param ValorHoras 
     * @return numero flotante con valor a pagar 
     */
    
    public static double Dinero (double horas, double ValorHoras){
       double totalsalario =0;
       double aux = 0;
       aux=horas-40;
        if(aux<=0){
        totalsalario= horas*ValorHoras; 
    }else if (horas>40 && horas<=48){
         totalsalario= horas*ValorHoras;  
        totalsalario=horas*((ValorHoras*2));
            
        }else{
        totalsalario=((ValorHoras*40)+((ValorHoras*2)*8)+((horas-48)*(ValorHoras*3)));
    }
       return totalsalario;      
        
    }
    
    
