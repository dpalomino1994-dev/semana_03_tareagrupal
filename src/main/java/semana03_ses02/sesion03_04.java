package semana03_ses02;
import java.util.Scanner;
public class sesion03_04 {
      public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera:");
          int numero = sc.nextInt();
          if(numero>0){
              System.out.println("el numero es positivo");
             if(numero%2==0){
                 System.out.println("El numero es positivo y par");
             } else{
                 System.out.println("El numero es positivo e impar");
             }
            } else if(numero<0){
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es cero");
            }
    }   
}
