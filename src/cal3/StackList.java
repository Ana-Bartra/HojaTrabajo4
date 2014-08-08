/**
* Algoritmos y Estructura de Datos
* Hoja de trabajo 2
* Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
* StackArrayList.java
*/



public class StackList<E> extends AbstractStack<E>
{

    protected List<E> data;

public StackList(String tipo_lista)
// pre: no se necesita
// post: constructor de una pila
{
    if (tipo_lista.equals("1")){
        System.out.println("SingleLinkedList");
        data = new SingleLinkedList<E>();
    } else if (tipo_lista.equals("2")){
        System.out.println("DoubleLinkedList");
        data = new DoubleLinkedList<E>();
    } else {
        System.out.println("CiruclarList");
        data = new CircularList<E>();
    }
    
}
public void push(E item)
// pre: no se necesita
// post: un nuevo dato se guarda en la pila
{
data.addLast(item);
}
public E pop()
// pre: se realiza solamente si la pila tiene algun dato guardado
// post: se saca de la pila el último dato guardado
{
return data.removeLast();
}
public E peek()
// pre: se realiza solamente si la pila tiene algun dato guardado
// post: indica cual ue el ultimo dato guardado
{
return data.getFirst();
}
public int size()
// pre: no se necesita
// post: cuenta la cantidad de datos en la pila
{
return data.size();
}
public boolean empty()
// pre: no se necesita
// post: devuelve true si la pila esta vacia y false si tiene algun dato guardado
{
return size() == 0;
}
}