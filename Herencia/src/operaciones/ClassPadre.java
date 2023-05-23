package operaciones;
import java.util.Scanner;

public class ClassPadre {
    protected int valor1, valor2, resultado;
    Scanner in = new Scanner(System.in);
    
    //Este método pide los valores al usuario.
    public void PedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor1 = in.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = in.nextInt();
    }
    
    //Este método muestra el resultado. 
   public void MostrarResultado(){
       System.out.println(resultado);
   }
    
}
