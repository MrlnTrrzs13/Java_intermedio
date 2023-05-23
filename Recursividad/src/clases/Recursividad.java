package clases;

public class Recursividad {

    public void Print(int x) {
        if (x <= 5) {
            System.out.print(x + " ");
            Print(x + 1);
        }
    }

}
