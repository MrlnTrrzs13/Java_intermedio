package clases;
import java.util.Scanner;

public class ConConstructor {
    
    public ConConstructor(){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("¿Cuál es tú nombre?: ");
        nombre = in.nextLine();
        System.out.println("Tú nombre es: " + nombre);
    }
}
