package clases;

public class Deposito extends Abstracta {
    @Override
    public void  Transactions(){
        System.out.print("Cuanto deseas depositar: ");
        Deposit();
        
        transactions = getBalance();
        setBalance(transactions + deposit);
        System.out.println("-------------------------------");
        System.out.println("Depositaste: " + deposit);
        System.out.println("Tú saldo actúal es: " + getBalance());
        System.out.println("===============================");
    }
}
