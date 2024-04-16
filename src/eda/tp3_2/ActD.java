package eda.tp3_2;

import pila.UtilidadesPila;
import pila.Pila;

/**
 *
 * @author alancito
 */
public class ActD {
    
    public static void unidosOrdenados(Pila pila1, Pila pila2){
        int tamPila=pila1.getTope()+1+pila2.getTope()+1;
        Pila pResultante=new Pila(tamPila);
        
        //Las Pilas vienen ordenadas de Mayor a Menor
        while(!pila1.pilaVacia() && !pila2.pilaVacia()){
            if(pila1.verElemento()<pila2.verElemento()){
                pResultante.push(pila1.verElemento());
                pila1.pop();
            }else{
                pResultante.push(pila2.verElemento());
                pila2.pop();
            }
        }
        while(!pila1.pilaVacia()){
            pResultante.push(pila1.verElemento());
            pila1.pop();
        }
        while(!pila2.pilaVacia()){
            pResultante.push(pila2.verElemento());
            pila2.pop();
        }
        
        UtilidadesPila.invierteEficiente(pResultante);
        pResultante.mostrarPila();   
    }
}
