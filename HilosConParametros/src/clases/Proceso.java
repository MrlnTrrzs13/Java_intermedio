package clases;

public class Proceso extends Thread{
    int numberUno;
    public Proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    @Override
    public void run(){
        for(int i=0; i<=numberUno; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void Receptor(int value){
        this.numberUno = value;
    }
}
