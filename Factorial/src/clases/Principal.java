package clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el numero para calcular el factorial: ");
        int numero = in.nextInt();

        Recursividad recursivity = new Recursividad();
        int factorial = recursivity.Factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
