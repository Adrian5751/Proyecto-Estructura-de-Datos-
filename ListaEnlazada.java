public class ListaEnlazada<E> implements Lista<E> {
    private Nodo<E> primero;
    private int size;

    public ListaEnlazada() {
        primero = null;
        size = 0;
    }

    @Override
    public void add(E e) {
        Nodo<E> nuevo = new Nodo<>(e);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo<E> temp = primero;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = nuevo;
        }
        size++;
    }

    @Override
    public E get(int index) {
      if (index < 0 || index >= size){
        return null;
        Nodo<E> temp = primero;
          }
        for (int i = 0; i < index; i++) {
            temp = temp.link;
        }
        return temp.dato;
    }

    @Override
    public E remove(int index) {
      if (index < 0 || index >= size){
        return null;
        Nodo<E> eliminado;
          } 
        if (index == 0) {
            eliminado = primero;
            primero = primero.link;
        } else {
            Nodo<E> temp = primero;
        for (int i = 0; i < index - 1; i++) {
                temp = temp.link;
            }
            eliminado = temp.link;
            temp.link = eliminado.link;
        }
        size--;
        return eliminado.dato;
    }

    @Override
    public int size() { 
    return size;
 }

    @Override
    public void clear() {
  primero = null; 
  size = 0; 
}

    @Override
    public boolean isEmpty() { 
    return size == 0;
 }

    @Override
    public void add(E e, int index) {
      if (index < 0 || index > size){
          return;
        Nodo<E> nuevo = new Nodo<>(e);
   } 
        if (index == 0) {
            nuevo.link = primero;
            primero = nuevo;
        } else {
            Nodo<E> temp = primero;
        for (int i = 0; i < index - 1; i++) {
                temp = temp.link;
            }
            nuevo.link = temp.link;
            temp.link = nuevo;
        }
        size++;
    }
