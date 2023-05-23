package clase;

public class SumaMatrices {

    public static void main(String[] args) {
        int matrizUno[][] = new int[3][3];
        int matrizDos[][] = new int[3][3];
        int matrizResultante[][] = new int[3][3];

        //Llenado de la primera matriz.
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
                matrizUno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
                matrizDos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma y Resta de Matrices.
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
                matrizResultante[i][j] = matrizUno[i][j] + matrizDos[i][j];
                matrizResultante[i][j] = matrizUno[i][j] - matrizDos[i][j];
            }
        }

        //Imprimir Matrices
        for (int i = 0; i < matrizResultante.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
                System.out.print("[ " + matrizUno[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }
            for (int j = 0; j < matrizDos.length; j++) {
                System.out.print("[ " + matrizDos[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.print("[ " + matrizResultante[i][j] + " ]");
            }
            System.out.println("");
        }
    }
}
