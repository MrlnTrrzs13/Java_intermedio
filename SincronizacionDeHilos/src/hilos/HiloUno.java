package hilos;

public class HiloUno extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ": G");

            //HiloUno.
            try {
                HiloUno.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR en el Hilo1" + e);
            }

        }
    }
}
