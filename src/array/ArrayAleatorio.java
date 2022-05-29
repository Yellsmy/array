
package array;


public class ArrayAleatorio {
    int arrayEnt[];
    
    public ArrayAleatorio(int cantidad){
        this.arrayEnt = new int[cantidad];       
    }
    
    public void aleatorio(){
        System.out.println("El arreglo es:");
        System.out.print("[");
        for(int i =0; i<arrayEnt.length; i++){
            arrayEnt[i]= (int)(Math.random()*100);
            System.out.print(arrayEnt[i]+",");         
        }
        System.out.print("]");
    }
    
}
