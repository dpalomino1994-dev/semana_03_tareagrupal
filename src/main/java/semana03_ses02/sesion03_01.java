package semana03_ses02;
import java.util.Scanner;
public class sesion03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera:");
        int numero = sc.nextInt();
        if(numero>0){
            if(numero%2==0){
                System.out.println("El numero es positivo y par");
            }
            else{
                System.out.println("El numero es positivo e impar");
            }
        }
        else{
            System.out.println("El numero ingresado no es positivo");
        }
      
}          
} 
        
        
        
        
 
    

