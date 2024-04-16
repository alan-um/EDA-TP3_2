package pila;

/**
 *
 * @author alancito
 */
public class UtilidadesPila {
    
    public static void copiaPila(Pila pilaOrigen, Pila pcopiada){
        int tamPila=pilaOrigen.getTope()+1;
        Pila paux=new Pila(tamPila);
        
        //Copia los valores originales en paux, invertidos
        for(int i=0;i<tamPila;i++){
            paux.push(pilaOrigen.verElemento());
            pilaOrigen.pop();
        }
        
        //Copia los valores de paux en pcopiada, invertidos nuevamente (o sea, como la original)
        for(int i=0;i<tamPila;i++){
            pcopiada.push(paux.verElemento());
            paux.pop();
        }
    }
    
    public static void invierteSimple(Pila pilaOrigen){
        int tamPila=pilaOrigen.getTope()+1;
        Pila p1=new Pila(tamPila);
        Pila p2=new Pila(tamPila);
        
        //Invierte valores originales en p1
        for(int i=0;i<tamPila;i++){
            p1.push(pilaOrigen.verElemento());
            pilaOrigen.pop();
        }
        
        //Invierte los valores de p1 en p2
        for(int i=0;i<tamPila;i++){
            p2.push(p1.verElemento());
            p1.pop();
        }
        
        //Invierte los valores de p2 en original
        for(int i=0;i<tamPila;i++){
            pilaOrigen.push(p2.verElemento());
            p2.pop();
        }
    }
    
    public static void invierteEficiente(Pila pilaOrigen){
        int tamPila=pilaOrigen.getTope()+1;
        int aux;
        Pila paux=new Pila(tamPila);
        
        for(int i=1;i<=tamPila;i++){
            aux=pilaOrigen.verElemento();
            pilaOrigen.pop();
            for(int j=0;j<tamPila-i;j++){
                paux.push(pilaOrigen.verElemento());
                pilaOrigen.pop();
            }
            pilaOrigen.push(aux);
            for(int j=0;j<tamPila-i;j++){
                pilaOrigen.push(paux.verElemento());
                paux.pop();
            }
        }
    }
    
    public static void ordenaMenAMay(Pila pilaOrigen){
        int tamPila=pilaOrigen.getTope()+1;
        
        Pila pOrdenada = new Pila(tamPila);
        Pila paux = new Pila(tamPila);
        
        //Ordena la pilaOriginal de Menor a Mayor en pOrdenada
        pOrdenada.push(pilaOrigen.verElemento());
        pilaOrigen.pop();
        while(!pilaOrigen.pilaVacia()){
            while(!pOrdenada.pilaVacia() ){
                if(pOrdenada.verElemento()>pilaOrigen.verElemento()){
                    paux.push(pOrdenada.verElemento());
                    pOrdenada.pop();
                }else{
                    break;
                }
            }
            pOrdenada.push(pilaOrigen.verElemento());
            pilaOrigen.pop();
            while(!paux.pilaVacia()){
                pOrdenada.push(paux.verElemento());
                paux.pop();
            }
        }
        copiaPila(pOrdenada,pilaOrigen);
    }
    
    public static void ordenaMayAMen(Pila pilaOrigen){
        int tamPila=pilaOrigen.getTope()+1;
        
        Pila pOrdenada = new Pila(tamPila);
        Pila paux = new Pila(tamPila);
        
        //Ordena la pilaOriginal de Mayor a Menor en pOrdenada
        pOrdenada.push(pilaOrigen.verElemento());
        pilaOrigen.pop();
        while(!pilaOrigen.pilaVacia()){
            while(!pOrdenada.pilaVacia() ){
                if(pOrdenada.verElemento()<pilaOrigen.verElemento()){
                    paux.push(pOrdenada.verElemento());
                    pOrdenada.pop();
                }else{
                    break;
                }
            }
            pOrdenada.push(pilaOrigen.verElemento());
            pilaOrigen.pop();
            while(!paux.pilaVacia()){
                pOrdenada.push(paux.verElemento());
                paux.pop();
            }
        }
        copiaPila(pOrdenada,pilaOrigen);
    }
}
