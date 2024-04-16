package pila;

import java.util.Random;


public class Pila {
 
    private int[] listaPila;
    private int tope;
    private int tam;

    public Pila(int tam) {
        this.tam = tam;
        listaPila= new int[tam];
        tope=-1;
    }

    public int getTope() {
        return tope;
    }
    
    
    //Metodos Pila - según TP3.1a
    public boolean pilaLlena(){
        
        if (tope==tam-1) {
            return true;
        }else{
            return false;
        } 
    }
    
    public boolean pilaVacia(){
        
        if (tope==-1) {
            return true;
        }else{
            return false;
        } 
    }

    public void push(int elemento){
        // 1- VERIFICAR SI ESTA LLENO
        // 2- INCREMENTAR EL TOPE
        // 3- push
        if (pilaLlena()) {
            System.out.println("No se puede añadir elemento, la pila esta llena");
        }
        else {
            //System.out.println("Añadiendo elemento");
            tope ++;
            listaPila[tope] = elemento;
        }
    }
    
    public void pushOrdenado(int elemento){
        Pila paux=new Pila(tope+1);
        
        while(!pilaVacia()&&elemento<verElemento()){
            paux.push(verElemento());
            pop();
        }
        push(elemento);
        while(!paux.pilaVacia()){
            push(paux.verElemento());
            paux.pop();
        }
    }
    
    public void pop(){
        // 1- VERIFICAR SI ESTA VACIO
        // 2- DECREMENTAR EL TOPE
        if (pilaVacia()) {
            System.out.println("pop() -> La pila esta vacía, no se puede eliminar ningún elemento");
        }
        else {
            //System.out.println("Eliminando elemento");
            tope --;
        }
    }
    
    public int verElemento(){
        // 1- VERIFICAR SI ESTA VACIO
        // 2- MOSTRAR ELEMENTO SI NO ESTA VACIO    
        
        if(pilaVacia()){
            System.out.println("verElemento() -> No se puede ver el elemento. La pila está vacía");
            return -1;   
        }
        else{
            return listaPila[tope];
        }
    }
    
    //Metodos Pila - AUXILIARES
    public void mostrarPila(){
        
        if(pilaVacia()){
            System.out.println("mostrarPila() -> La pila está vacía");
        }
        else{
            for (int i = 0; i <=tope; i++) {
                if(i==tope){
                    System.out.println(listaPila[i]);
                }else{
                    System.out.print(listaPila[i]+" - ");
                }
            }
//            if(pilaLlena()){
//                System.out.println("mostrarPila() -> La Pila está llena.");
//            }
        }
    }
    
    public void cargaAleatorio(){
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            push(random.nextInt(100)); // Números aleatorios entre 0 y 99
        }
    }
    
    public void cargaOrdenada(){
        Random random = new Random();
        
        for (int i = 0; i < tam; i++) {
            pushOrdenado(random.nextInt(100)); // Números aleatorios entre 0 y 99
        }
    }
    
}
