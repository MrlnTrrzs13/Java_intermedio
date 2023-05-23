package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        try {
            int value1, value2, result;
            Scanner in = new Scanner(System.in);

            System.out.print("Dame el primer valor: ");
            value1 = in.nextInt();
            System.out.print("Dame el segundo valor: ");
            value2 = in.nextInt();

            result = value1 / value2;

            System.out.println("División es igual a: " + result);
        } catch (Exception e) {
            System.out.println("ERROR!!! " + e);
        } finally {
            System.out.println("Operación concluida.");
        }
    }
}
