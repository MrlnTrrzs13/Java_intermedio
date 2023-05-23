package clases;

public class Proceso extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Proceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR dentro de la clase " + e);
            }
        }
    }
}
