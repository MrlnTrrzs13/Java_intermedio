package lavadora_uno;

import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color? ");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa de color");
        int typeOfClothing = in.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = in.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, typeOfClothing);
        mensajero.setTypeClothing(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTypeClothing());
        mensajero.CicloFinalizado();
    }
}
