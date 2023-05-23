package clases;

public class Recursividad {

    public int Factorial(int parameter) {
        if (parameter > 0) {
            int calculateValue = parameter * Factorial(parameter - 1);
            return calculateValue;
        }
        return 1;
    }
}
