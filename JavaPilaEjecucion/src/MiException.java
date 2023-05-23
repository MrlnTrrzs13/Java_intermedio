public class MiException extends RuntimeException {
	 public MiException (String msg) {
         super(msg);
     }
	 
	 private static void metodo1() throws MiException {
		 System.out.println("Inicio del metodo1");
		 metodo2();
		 System.out.println("Fin del metodo1");
	 }

	 private static void metodo2() throws MiException {
		 System.out.println("Inicio del metodo2");
		 throw new MiException ("Surgió un error");
		 // System.out.println("Fin del metodo2");            
	 }
}
