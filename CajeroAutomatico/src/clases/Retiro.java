package clases;

public class Retiro extends Abstracta {

    @Override
    public void Transactions() {
        System.out.print("¿Cuánto deceas retirar?: ");
        Withdrawal();
        if (withdrawal <= getBalance()) {
            transactions = getBalance();
            setBalance(transactions - withdrawal);
            System.out.println("-------------------------------");
            System.out.println("Retiraste: " + withdrawal);
            System.out.println("Tú saldo actual es: " + getBalance());
            System.out.println("===============================");
        } else {
            System.out.println("------------------");
            System.out.println("Saldo Insuficiente");
            System.out.println("==================");
        }
    }
}