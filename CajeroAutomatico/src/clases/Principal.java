package clases;

public class Principal {
    public static void main(String[] args) {
        Abstracta saldo = new Consulta();
        saldo.setBalance(500);
        saldo.Operations();
    }
}
