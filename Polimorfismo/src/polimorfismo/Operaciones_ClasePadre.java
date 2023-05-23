package polimorfismo;
import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner in = new Scanner(System.in);
    
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = in.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2 = in.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado() {
        System.out.println(resultado);
    }
}
