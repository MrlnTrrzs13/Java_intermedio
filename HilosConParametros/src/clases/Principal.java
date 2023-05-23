package clases;

public class Principal {

    public static void main(String[] args) {

        Proceso hiloUno = new Proceso(" hilo1");
        Proceso hiloDos = new Proceso(" hilo2");
        Proceso hiloTres = new Proceso(" hilo3");

        hiloUno.Receptor(5);
        hiloDos.Receptor(10);
        hiloTres.Receptor(6);

        hiloUno.start();
        hiloDos.start();
        hiloTres.start();
    }
}
