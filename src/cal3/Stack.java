/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 2
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Stack.java
 * 
 */
//package calc;

public interface Stack<E> 
{

   public void push(E item);
   // pre: no se necesita
   // post: un nuevo dato se guarda en la pila

   
   public E pop();
   // pre: se realiza solamente si la pila tiene algun dato guardado
   // post: se saca de la pila el último dato guardado
   
   public E peek();
   // pre: se realiza solamente si la pila tiene algun dato guardado
   // post: indica cual ue el ultimo dato guardado
   
   public boolean empty();
   // pre: no se necesita
   // post: devuelve true si la pila esta vacia y false si tiene algun dato guardado
   
   public int size();
   // pre: no se necesita
   // post: cuenta la cantidad de datos en la pila

}
