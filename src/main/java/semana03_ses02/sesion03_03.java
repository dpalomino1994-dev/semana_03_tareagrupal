package semana03_ses02;
import java.util.Scanner;
public class sesion03_03 {
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un numerocualquiera:");
                int numero = sc.nextInt();
                if(numero>0){
                    if(numero<=50){
                        System.out.println("El numero esta en el rango de 1 a 50");
                    }else{
                        System.out.println("El numero es mayor a 50");
                    }
                }else{
                            System.out.println("El numero no es positivo");
                            }      
    }
}
