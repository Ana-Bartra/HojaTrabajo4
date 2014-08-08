/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Ana Bartra 13643, Luis Orellana 13140
 * Stack.java
 * codigo tomado de libro de Clements
 */
//package calc;
//package Cal3;
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
