package area;

public class Rectangulo {
    private int base, height, resultArea;
    
    public Rectangulo(int base, int height){
    this.base = base;
    this.height = height;
    }
    
    public void Operacion(){
        resultArea = base * height;
    }
    
    public void imprimir(){
        Operacion();
        System.out.println("El area del rectangulo es: " + resultArea);
    }
}
