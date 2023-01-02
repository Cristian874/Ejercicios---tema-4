
package project5;

import java.util.Scanner;

public class Project5 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int auxiliar;
        int bandera;
        
        System.out.println("Vamos a realizar las operaciones arísmeticas básicas");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicación");
        System.out.println("División");
        auxiliar = dato.nextInt();
        
        switch(auxiliar){
            
            case 1:
                System.out.println("Dame un número");
                num1 = dato.nextInt();
                 System.out.println("Dame otro número");
                num2 = dato.nextInt();
            
                
                bandera = num1 + num2;
                System.out.println("El resultado es : " + bandera);
                break;
                       
            case 2:
                System.out.println("Dame un número");
                num1 = dato.nextInt();
                 System.out.println("Dame otro número");
                num2 = dato.nextInt();
            
                
                bandera = num1 - num2;
                System.out.println("El resultado es : " + bandera);
                break;  
                
            case 3:
                System.out.println("Dame un número");
                num1 = dato.nextInt();
                 System.out.println("Dame otro número");
                num2 = dato.nextInt();
            
                
                bandera = num1 * num2;
                System.out.println("El resultado es : " + bandera);
                break; 
                
            case 4:
                System.out.println("Dame un número");
                num1 = dato.nextInt();
                 System.out.println("Dame otro número");
                num2 = dato.nextInt();
            
                
                bandera = num1 / num2;
                System.out.println("El resultado es : " + bandera);
                break;
                
                
            default:
                 System.out.println("Fuera de Intervalo : ");

                
            
        }
    }
    
}
