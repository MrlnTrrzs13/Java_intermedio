package hilos;

public class HiloCuatro extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("k");

            //HiloCuatro.
            try {
                HiloCuatro.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR en el Hilo4" + e);
            }
        }
    }

}
