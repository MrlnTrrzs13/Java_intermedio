package clases;

public class Consulta extends Abstracta {
    
    @Override
    public void Transactions(){
        System.out.println("---------------------------------");
        System.out.println("Tú saldo actual es: " + getBalance());
        System.out.println("=================================");
    }
}
