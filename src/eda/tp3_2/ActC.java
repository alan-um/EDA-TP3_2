package eda.tp3_2;

import pila.Pila;

public class ActC {
    
    public static void moverPilares(Pila pilaOrigen){
        int tamPila=pilaOrigen.getTope()+1;
        Pila pFinal=new Pila(tamPila);
        Pila pAux=new Pila(tamPila);
        
        while(!pFinal.pilaLlena()){
            //Final está vacío??
            if(pFinal.pilaVacia()){
                pFinal.push(pilaOrigen.verElemento());
                pilaOrigen.pop();
            //Sino Aux está vacío??    
            }else if(pAux.pilaVacia()){
                pAux.push(pilaOrigen.verElemento());
                pilaOrigen.pop();
            }else{
                //El del final, es mayor??
                if((pilaOrigen.pilaVacia()||pFinal.verElemento()>pilaOrigen.verElemento())&&pFinal.verElemento()>pAux.verElemento()){//pregunta si el disco del final es el mayor
                    if(!pilaOrigen.pilaVacia()&&pilaOrigen.verElemento()>pAux.verElemento()){
                        pFinal.push(pilaOrigen.verElemento());
                        pilaOrigen.pop();
                    }else{
                        pFinal.push(pAux.verElemento());
                        pAux.pop();
                    }
                //Sino, el del final es menor??
                }else{
                    if(!pilaOrigen.pilaVacia()||(pFinal.verElemento()<pilaOrigen.verElemento())&&pFinal.verElemento()<pAux.verElemento()){//pregunta si el disco del final es el mayor
                        if(pilaOrigen.pilaVacia()||(pilaOrigen.verElemento()<pAux.verElemento())){
                            pilaOrigen.push(pFinal.verElemento());
                            pFinal.pop();
                            pFinal.push(pAux.verElemento());
                            pAux.pop();
                        }else{
                            pAux.push(pFinal.verElemento());
                            pFinal.pop();
                            pFinal.push(pilaOrigen.verElemento());
                            pilaOrigen.pop();
                        }
                    //Sino, el del final es intermedio
                    }else{
                        if(pilaOrigen.verElemento()<pAux.verElemento()){
                            pAux.push(pilaOrigen.verElemento());
                            pilaOrigen.pop();
                            pilaOrigen.push(pFinal.verElemento());
                            pFinal.pop();
                            pilaOrigen.push(pAux.verElemento());
                            pAux.pop();
                            pFinal.push(pAux.verElemento());
                            pAux.pop();
                        }else{
                            pilaOrigen.push(pAux.verElemento());
                            pAux.pop();
                            pAux.push(pFinal.verElemento());
                            pFinal.pop();
                            pAux.push(pilaOrigen.verElemento());
                            pilaOrigen.pop();
                            pFinal.push(pilaOrigen.verElemento());
                            pilaOrigen.pop();
                        }
                    }
                }
            }
        }
        System.out.print("Pila Origen: ");
        pilaOrigen.mostrarPila();
        System.out.print("Pila Aux: ");
        pAux.mostrarPila();
        System.out.print("Pila Final: ");
        pFinal.mostrarPila();
    }
    
}
