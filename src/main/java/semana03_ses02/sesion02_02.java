package semana03_ses02;
import java.util.Scanner;
public class sesion02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opción:");
        System.out.println("1.  mensaje para un número positivo.");
        System.out.println("2.  mensaje para un número negativo.");
        System.out.println("3.  mensaje para el número cero.");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                System.out.println("¡El número es positivo!");
            }
         else {
            System.out.println("El número no es positivo.");
        } 
        }else if (opcion == 2){             
    System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("¡El número es negativo!");
        } else {
            System.out.println("El número no es negativo.");
        }
        }else if (opcion == 3) {                      
                System.out.print("Ingrese un número: ");            
                int numero = sc.nextInt();                        
                if (numero == 0) {                
                System.out.println("¡El número es cero!");            
                } else {                
                System.out.println("El número no es cero.");            }        
                } 
        else {            
                System.out.println("Operacion invalida.");        }
    }
 }

