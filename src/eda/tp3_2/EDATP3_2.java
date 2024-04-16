package eda.tp3_2;

import pila.UtilidadesPila;
import pila.Pila;

/**
 *
 * @author alancito
 */
public class EDATP3_2 {

    public static void main(String[] args) {
        //ACTIVIDAD A
        Pila p1=new Pila(5);
        p1.cargaOrdenada();
        p1.mostrarPila();
//        
//        
//        //ACTIVIDAD B
//        String cadena="{[a+b)*c]-(d+e)}";
//        //String cadena="{[(a+b)*c]-(d+e)}";
//        //String cadena="<metodo()>";
//        //String cadena="{[(a+b)*c]-(d+e})";
//        ActB.chequeaCadena(cadena);
//        
//
//        //ACTIVIDAD C
//        Pila p1=new Pila(5);
//        int array[]={1,5,3,7,2};
//        for (int i = 0; i < 5; i++) {
//            p1.push(array[i]); // Números aleatorios entre 0 y 99
//        }
//        System.out.print("Pila Origen: ");
//        p1.mostrarPila();
//        System.out.println("Reubicando pilares....");
//        ActC.moverPilares(p1);
//        
//        
//        //ACTIVIDAD D
//        //Crea la Pila 1, ordenada de mayor a menor
//        Pila p1=new Pila(5);
//        p1.cargaAleatorio();
//        UtilidadesPila.ordenaMayAMen(p1);
//        System.out.print("Pila1 en main -> ");
//        p1.mostrarPila();
//
//        
//        //Crea la Pila 2, ordenada de mayor a menor
//        Pila p2=new Pila(3);
//        p2.cargaAleatorio();
//        UtilidadesPila.ordenaMayAMen(p2);
//        System.out.print("Pila2 en main -> ");
//        p2.mostrarPila();
//        
//        //Une Pila1 y Pila2 ordenada de mayor a menor
//        ActD.unidosOrdenados(p1, p2);
    }
}
