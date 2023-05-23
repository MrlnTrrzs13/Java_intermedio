package decimales;

import java.text.DecimalFormat;

public class ClasePrincipal {

    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de: " + numero + " es: " + raiz);

        //Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raíz cuadrada de: " + numero + " es: " + df.format(raiz));

        //Utilizando String format.
        System.out.println("La raíz cuadrada de: " + numero + " es: " + String.format("%.3f", raiz));

        //Utilizando la clase Math.round
        System.out.println("La raíz cuadrada de: " + numero + " es: " + (double) Math.round(raiz * 10000d) / 10000);
    }
}
