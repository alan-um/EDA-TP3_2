package eda.tp3_2;

import pila.UtilidadesPila;
import pila.Pila;

/**
 *
 * @author alancito
 */
public class ActB {
    
    public static void chequeaCadena(String cadena){
        int tamPila=cadena.length();
        Pila pila=new Pila(tamPila);
        String abreParensis="<{[(";
        
        for(int i=0;i<tamPila;i++){
            switch(cadena.charAt(i)){
                case '(','[','{','<':
                    pila.push(cadena.charAt(i));
                    break;
                case ')':
                    if(!pila.pilaVacia()&&pila.verElemento()=='('){
                        pila.pop();
                    }else{
                        pila.push('e');
                    }
                    break;
                case ']':
                    if(!pila.pilaVacia()&&pila.verElemento()=='['){
                        pila.pop();
                    }else{
                        pila.push('e');
                    }
                    break;
                case '}':
                    if(!pila.pilaVacia()&&pila.verElemento()=='{'){
                        pila.pop();
                    }else{
                        pila.push('e');
                    }
                    break;
                case '>':
                    if(!pila.pilaVacia()&&pila.verElemento()=='<'){
                        pila.pop();
                    }else{
                        pila.push('e');
                    }
                    break;
            }
            //Si detecta 'e' en la pila, rompre el bucle antes de terminar de recorrer la cadena.
            if(!pila.pilaVacia()&&pila.verElemento()=='e'){
                break;
            }
        }
        //Si la pila está vacía, todos los parentesis se cerraron correctamente.
        if(pila.pilaVacia()){
            System.out.println("Cadena equilibrada");
        }else{
            System.out.println("Cadena desequilibrada");
        }
    }
    
    
    
}
