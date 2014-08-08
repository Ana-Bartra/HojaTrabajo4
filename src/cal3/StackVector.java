/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * StackVector.java
 */

//package calc;

import java.util.Vector;

/**
 *
*/
public class StackVector<E> extends AbstractStack<E>{

    protected   Vector<E> data;
    protected   int indice   = 0;
    
    public StackVector()
	 // pre: no se necesita
	// post: constructor de una pila
    {
            data = new Vector<E>();
    }
    
    public void push(E item) {
        // pre: no se necesita
        // post: un nuevo dato se guarda en la pila
        data.add(item);
    }


    public E pop() {    
        // pre: se realiza solamente si la pila tiene algun dato guardado
         // post: se saca de la pila el último dato guardado
        E item = data.lastElement();
        data.remove(data.size()-1);
        return item;

    }

    
    public E peek() {
        // pre: se realiza solamente si la pila tiene algun dato guardado
        // post: indica cual ue el ultimo dato guardado
        return data.get(size() - 1);
    }

    
    public boolean empty() {
        // pre: no se necesita
        // post: devuelve true si la pila esta vacia y false si tiene algun dato guardado
        return size() == 0;
    }

    public int size() {
        // pre: no se necesita
        // post: cuenta la cantidad de datos en la pila
        return data.size();
    }
    
}
