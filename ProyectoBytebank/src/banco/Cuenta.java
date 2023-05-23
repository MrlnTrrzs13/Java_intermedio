package banco;

public class Cuenta {
	private double saldo;
	private int agencia, numero;
	private Cliente titular;
	private static int total = 0;

	public Cuenta(int agencia, int numero) {
		Cuenta.total++;
		System.out.println("Total de cuentas es " + Cuenta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estoy creando una cuenta " + this.numero);
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("No puede ser el valor menor o igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("No puede ser el valor menor o igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}
