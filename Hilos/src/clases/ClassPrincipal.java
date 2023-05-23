package clases;

public class ClassPrincipal {

    public static void main(String[] args) {
        ProcesoUno hiloUno = new ProcesoUno();
        Thread hiloDos = new Thread(new ProcesoDos());

        hiloUno.start();
        hiloDos.start();
    }
}
