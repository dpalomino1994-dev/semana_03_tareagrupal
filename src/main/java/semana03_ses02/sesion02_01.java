package semana03_ses02;

import java.util.Scanner;

public class sesion02_01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    System.out.println("Elija la operacion q usted desee:");
 System.out.println("1. Calcular el cuadrado de un número.");        
 System.out.println("2. Verificar si un número es par o impar.");        
 System.out.println("3. Determinar si un número es positivo, negativo o cero.");        
 int opcion = sc.nextInt();        
 if (opcion == 1) {                       
     System.out.print("Ingrese un número: ");            
     double numero = sc.nextDouble();            
     double cuadrado = Math.pow(numero,2);
     System.out.println("El cuadrado de " + numero + " es: " + cuadrado);        } 
 else if (opcion == 2) {                       
     System.out.print("Ingrese un número: ");            
     int num = sc.nextInt();
if (num % 2 == 0) {                
    System.out.println(num + " es un número par.");            
} else {                
    System.out.println(num + " es un número impar.");            }        } 
 else if (opcion == 3) {                      
     System.out.print("Ingrese un número: ");            
     double numero2 = sc.nextDouble();
 if (numero2 > 0) {                
     System.out.println(numero2 + " es un número positivo.");            } 
 else if (numero2 < 0) {                
     System.out.println(numero2 + " es un número negativo.");            
 } else {                
     System.out.println("El número es cero.");            }       
 } else {            
     System.out.println("Operacion invalida.");        }    }
        
    }
    
