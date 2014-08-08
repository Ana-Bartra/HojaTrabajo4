/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 4
 * Ana Bartra 13643, Luis Orellana 13140
 * AbstractStack.java
 * codigo tomado de libro de Clements
 */
//package Cal3;
abstract public class AbstractStack<E> implements Stack<E>
{
      public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}