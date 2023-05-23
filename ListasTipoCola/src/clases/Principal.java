package clases;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int option = 0, nodo_information = 0;
        Cola line = new Cola();
        
        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menú de opciones\n\n"
                        + "1. Insertar un Nodo.\n"
                        + "2. Extraer el nodo. \n"
                        + "3. Mostrar el contenido en la cola. \n"
                        + "4. Salir.\n\n"));
                switch (option) {
                    case 1:
                         nodo_information = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                 "Porfavor Ingresa el valor a guardar en el nodo"));
                         line.Insert(nodo_information);
                        break;
                        
                    case 2:
                        if (!line.EmptyLine()) {
                            JOptionPane.showMessageDialog(null, 
                                 "Se extrajo un nodo con el valor: " 
                                  + line.Extract());
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                 "La cola esta vacia");
                        }
                        break;
                    
                    case 3:
                        line.ShowContent();
                        break;
                    
                    case 4:
                        option = 4;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no disponible.");
                }
            } catch (NumberFormatException e) {
                
            }            
        } while (option != 4);
    }
}
