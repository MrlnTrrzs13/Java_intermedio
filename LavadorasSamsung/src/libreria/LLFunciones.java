/*
 *Clase para las funciones logicas de una lavadora.
 */
package libreria;
//@author Brandon

public class LLFunciones {
    private int kilos = 0, fullFill = 0, typeOfClothing = 0, fullWash = 0, completeDrying = 0;
    
    public LLFunciones(int kilos, int typeOfClothing){
        this.kilos = kilos;
        this.typeOfClothing = typeOfClothing;
    }
    
    private void Fill(){
        if (kilos <= 12){
            fullFill = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga.");
        }
    }
    
    private void Washed(){
        Fill();
        if(fullFill == 1) {
            if(typeOfClothing == 1){
                System.out.println("Ropa blanca / Lavado Suave");
                System.out.println("Lavando...");
                fullWash = 1;
            } else if(typeOfClothing == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                fullWash = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible.");
                System.out.println("Se lavara como ropa de color.");
                fullWash = 1;
            }
        }
    }
    
    private void Drying(){
        Washed();
        
        if(fullWash == 1){
            System.out.println("Secando...");
            completeDrying = 1;
        }
    }
    
    public void CicloFinalizado(){
        Drying();
        
        if(completeDrying == 1){
            System.out.println("Tu ropa esta lista!");
        }
    }
    
    //Setter Getter.
    
    public int getTypeClothing (){
        return typeOfClothing;
    }
    public void setTypeClothing(int typeOfClothing){
        this.typeOfClothing = typeOfClothing;
    }
}
