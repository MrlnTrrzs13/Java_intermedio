package clases;

import java.util.Scanner;

public abstract class Abstracta {

    protected int transactions, withdrawal, deposit;
    private static int balance;
    Scanner in = new Scanner(System.in);

    public void Operations() {
        int bandera = 0;
        int selection = 0;
        do {
            do {
                System.out.println("Por favor seleccione una opcion:");
                System.out.println("================================");
                System.out.println("");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo");
                System.out.println("    3. Deposito de efectivo");
                System.out.println("    4. Salir");
                selection = in.nextInt();

                if (selection >= 1 && selection <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar");
                    System.out.println("=======================================");
                }
            } while (bandera == 0);

            if (selection == 1) {
                Abstracta consultar = new Consulta();
                consultar.Transactions();
            } else if (selection == 2) {
                Abstracta retirar = new Retiro();
                retirar.Transactions();
            } else if (selection == 3) {
                Abstracta depositar = new Deposito();
                depositar.Transactions();
            } else if (selection == 4) {
                System.out.println("------------------------");
                System.out.println("¡Gracias!, vuelva pronto");
                System.out.println("========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    
    //Método para solicitar cantidad de retiro.
    public void Withdrawal() {
        withdrawal = in.nextInt();
    }
    
    //Metodp para solicitar deposito.
    public void Deposit() {
        deposit = in.nextInt();
    }
    
    //Método abstracto.
    public abstract void  Transactions();
    
    //Método setter and getter.
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
}