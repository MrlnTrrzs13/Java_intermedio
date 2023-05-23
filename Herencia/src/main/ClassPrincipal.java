package main;
import operaciones.ClassHija_Resta;
import operaciones.ClassHija_Suma;

public class ClassPrincipal {
    public static void main(String[] args) {
        ClassHija_Suma suma = new ClassHija_Suma();
        suma.PedirDatos();
        suma.Sumar();
        System.out.print("El resultado de la suma es: ");
        suma.MostrarResultado();

        ClassHija_Resta resta = new ClassHija_Resta();
        resta.PedirDatos();
        resta.Restar();
        System.out.print("El resultado de la resta es: ");
        resta.MostrarResultado();
    }
    
}