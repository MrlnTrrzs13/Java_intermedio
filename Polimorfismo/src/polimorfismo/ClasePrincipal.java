package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        Operaciones_ClasePadre suma = new ClassHija_Suma();
        suma.PedirDatos();
        suma.Operaciones();
        suma.MostrarResultado();
        Operaciones_ClasePadre resta = new ClasHija_Resta();
        resta.PedirDatos();
        resta.Operaciones();
        resta.MostrarResultado();
    }
    
}
