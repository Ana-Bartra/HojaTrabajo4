public class DoubleLinkedNode<E>
{
protected E data;
protected DoubleLinkedNode<E> nextElement;
protected DoubleLinkedNode<E> previousElement;

public DoubleLinkedNode(E v, DoubleLinkedNode<E> next, DoubleLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DoubleLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

   public DoubleLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
   public DoubleLinkedNode<E> previous()
   // post: returns reference to next value in list
   {
      return previousElement;
   }

   public void setNext(DoubleLinkedNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }

}