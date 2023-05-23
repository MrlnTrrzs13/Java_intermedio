package hilos;

public class HiloDos extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("e");
                        
            //HiloDos.
            try {
                HiloDos.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR en el Hilo2" + e);
            }
        }
    }
}
