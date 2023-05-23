package clases;

public class ClassPrincipal {

    public static void main(String[] args) {
        Proceso hiloUno = new Proceso();
        Proceso hiloDos = new Proceso();

        hiloUno.start();
        try {
            hiloUno.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el hiloUno " + e);
        }

        hiloDos.start();
        hiloDos.stop();
        
        try {
            hiloDos.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR en el hiloDos " + e);
        }
    }
}
