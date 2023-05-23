package area;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        System.out.print("Dame el valor de la base: ");
        int base = in.nextInt();
        System.out.print("Dame el valor de la altura: ");
        int height = in.nextInt();

        Rectangulo values = new Rectangulo(base, height);
        values.imprimir();
    }
}
