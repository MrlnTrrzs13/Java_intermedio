package clases;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo startLine, finalLine;
    String line = "";

    public Cola() {
        startLine = null;
        finalLine = null;
    }

    //Método para saber si la cola esta vacia.
    public boolean EmptyLine() {
        if (startLine == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para insertar a la cola
    public void Insert(int informacion) {
        Nodo new_nodo = new Nodo();
        new_nodo.information = informacion;
        new_nodo.next = null;

        if (EmptyLine()) {
            startLine = new_nodo;
            finalLine = new_nodo;
        } else {
            finalLine.next = new_nodo;
            finalLine = new_nodo;
        }
    }

    //Método para extraer de la cola
    public int Extract() {
        if (!EmptyLine()) {
            int informacion = startLine.information;

            if (startLine == finalLine) {
                startLine = null;
                finalLine = null;
            } else {
                startLine = startLine.next;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Método para mostrar contenido de la cola.
    public void ShowContent() {
        Nodo route = startLine;
        String invertedLine = "";

        while (route != null) {
            line += route.information;
            route = route.next;
        }

        String cadena[] = line.split(" ");

        for (int i = cadena.length - 1; i >= 0; i--) {
            invertedLine += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, invertedLine);
        line = "";
    }
}
