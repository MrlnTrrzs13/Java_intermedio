package hilos;

public class HiloTres extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("e");

            //HiloTres.
            try {
                HiloTres.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR en el Hilo3" + e);
            }
        }
    }

}
