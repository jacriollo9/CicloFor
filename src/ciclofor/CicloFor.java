/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n = 0;
        int primero = 0;
        int segundo = 1;
        int fibo = 0;
        int suma = 0;
        int suma1 = 0;

        
        System.out.println("Ingrese el limite de la serie fibonacci");
        n = leer.nextInt();
        System.out.println("");
        
        for (int i = 1; i <= n; i++){
            
            if (i < 2){
                
                System.out.println(i + ", "+primero);
                System.out.println(i+1 + ", "+segundo); 
                suma = primero + segundo;
                i++;
            }
            else{
                
                fibo = primero + segundo;
                suma = suma + fibo;
                primero = segundo;
                segundo = fibo;
                        
                System.out.println(i + ", "+fibo);
            }   
        }
        System.out.println("\n PRIMERA SUMA:"+suma);
        System.out.println("Segunda solucion");
        
        primero = 0;
        segundo = 1;
        fibo = 0;
        
        for (int i = 1; i <= n; i++){
            
            System.out.println((i)+". " +primero);
            
            suma1 = suma1 + primero;
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
        }
        System.out.println("\n SEGUNDA SUMA:"+suma1);
    }  
}
