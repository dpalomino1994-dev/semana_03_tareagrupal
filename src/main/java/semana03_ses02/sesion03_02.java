package semana03_ses02;
import java.util.Scanner;
public class sesion03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numerocualquiera:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero % 2 != 0) {
            System.out.println("El numero es positivo e impar");
        } else {
            System.out.println("El numero es positivo y par");
        }
    }

}
