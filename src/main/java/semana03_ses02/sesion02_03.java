package semana03_ses02;

import java.util.Scanner;

public class sesion02_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opción:");
        System.out.println("1. Leer un número entero.");
        System.out.println("2. Leer un carácter.");
        System.out.println("3. Leer un número decimal.");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Ingrese un número entero: ");
            int numeroEntero = sc.nextInt();
            System.out.println(" El número entero es: " + numeroEntero);
        } else if (opcion == 2) {
            System.out.print("Ingrese un carácter: ");
            char caracter = sc.next().charAt(0);
            System.out.println("El caracter es: " + caracter);
        } else if (opcion == 3) {
            System.out.print("Ingrese un número decimal: ");
            double numeroDecimal = sc.nextDouble();
            System.out.println("El numero decimal es: " + numeroDecimal);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
