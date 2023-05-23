public class FlujoConTratamiento {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio metodo2");
		ArithmeticException ex = new ArithmeticException();
		throw ex;
		//throw new ArithmeticException();
		System.out.println("Fin metodo2");
	}
}

