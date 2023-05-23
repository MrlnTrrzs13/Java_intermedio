package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo lastValueEntered;
    int size = 0;
    String list = "";

    public Pila() {
        lastValueEntered = null;
        size = 0;
    }

    //Método para saber cuando la pila esta vacia
    public boolean EmptyStack() {

        return lastValueEntered == null;
    }

    //Método para insertar un node en la pila.
    public void EnterNodo(int nodo) {

        Nodo new_nodo = new Nodo(nodo);
        new_nodo.next = lastValueEntered;
        lastValueEntered = new_nodo;
        size++;
    }

    //Método para eliminar un nodo de la pila
    public int DeleteNodo() {
        int auxiliary = lastValueEntered.information;
        lastValueEntered = lastValueEntered.next;
        size--;
        return auxiliary;
    }
    
    //Método para conocer cual es el ultimo valor ingresado.
    public int showLastValueEntered() {
        return lastValueEntered.information;
    }
    
    //Metodo para conocer el tamaño de la pila
    public int SizeStack() {
        return size;
    }
    
    //Método para vaciar la pila
    public void ClearPila() {
        while(!EmptyStack()) {
            DeleteNodo();
        }
    }
    
    //Método para mostrar el contenido de la pila
    public void ShowValues() {
        Nodo route = lastValueEntered;
        while(route != null) {
            list += route.information + "\n";
            route = route.next;
        }
        JOptionPane.showMessageDialog(null, list);
        list = "";
    }
}
