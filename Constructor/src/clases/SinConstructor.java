package clases;
import java.util.Scanner;

public class SinConstructor {
    private Scanner in = new Scanner(System.in);
    String nombre = "";
    
    public void PedirNombre() {
        System.out.print("¿Cuál es tú nombre?: ");
        nombre = in.nextLine();
    }
    
    public void Imprimir (){
        System.out.println("Tú nombre es: " + nombre);
    }
}
