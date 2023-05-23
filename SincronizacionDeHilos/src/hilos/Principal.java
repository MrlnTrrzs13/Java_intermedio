package hilos;

public class Principal {

    public static void main(String[] args) {

        HiloUno hilo1 = new HiloUno();
        HiloDos hilo2 = new HiloDos();
        HiloTres hilo3 = new HiloTres();
        HiloCuatro hilo4 = new HiloCuatro();

        //HiloUno.
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el Hilo1" + e);
        }

        //HiloDos.
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el Hilo2" + e);
        }

        //HiloTres.
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el Hilo3" + e);
        }

        //HiloCuatro.
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el Hilo4" + e);
        }

    }
}
