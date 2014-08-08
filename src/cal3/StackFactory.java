
class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry, String tipo_lista) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("1")){
            System.out.println("Utilizando Stack ArrayList");
            return new StackArrayList<E>(); //regresa ArrayList
        }
        else if(entry.equals("2")) {
            System.out.println("Utilizando Stack Vector");
            return new StackVector<E>(); //regresa Vector
        }
        else {
            System.out.println("Utilizando Stack List");
            return new StackList<E>(tipo_lista); //regresa Vector
        }
   }
}