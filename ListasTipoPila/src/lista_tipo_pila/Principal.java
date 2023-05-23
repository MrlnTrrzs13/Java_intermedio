package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int option = 0, nodo = 0;
        Pila stack = new Pila();

        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                        + "1. Insertar un nodo \n"
                        + "2. Eliminar un nodo \n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Cuál es el ultimo valor ingresado en la pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar pila\n"
                        + "7. Mostrar contenido de la pila\n"
                        + "8. Salir.\n\n"));
                switch (option) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Porfavor ingresa el valor a guardar en el nodo"));
                        stack.EnterNodo(nodo);
                        break;
                        
                    case 2:
                        if(!stack.EmptyStack()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                + stack.DeleteNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 3:
                        if(stack.EmptyStack()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Pila No vacia.");
                        }
                        break;
                        
                    case 4:
                        if(!stack.EmptyStack()) {
                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es: " +
                                stack.showLastValueEntered());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + stack.SizeStack() + " nodos.");
                        break;
                    case 6:
                        if(!stack.EmptyStack()){
                            stack.ClearPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 7:
                        stack.ShowValues();
                        break;
                        
                    case 8:
                        option = 8;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a intentar nuevamente.");
                        break;
                }
                                
            } catch (NumberFormatException e) {

            }
        } while (option != 8);
    }
}
