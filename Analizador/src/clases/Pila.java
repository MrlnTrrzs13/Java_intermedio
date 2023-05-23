package clases;

public class Pila {
    private Nodo lastValueEntered;
    
    public Pila() {
        lastValueEntered = null;
    }
    
    //Métpdo para insertar dentro de la pila.
    public void Insert (char value) {
        Nodo new_nodo = new Nodo();
        new_nodo.information = value;
        
        if(lastValueEntered == null) {
            new_nodo.next = null;
            lastValueEntered = new_nodo;
        } else {
            new_nodo.next = lastValueEntered;
            lastValueEntered = new_nodo;
        }
    }
    
    //Métpdo para extraer la pila
    public char extract() {
        if (lastValueEntered != null) {
            char informacion = lastValueEntered.information;
            lastValueEntered = lastValueEntered.next;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }
    
    //Método para saber si la pila esta vacia
    public boolean EmptyStack() {
        return lastValueEntered == null;
    }
}
