public class ArrayList<E> implements Lista<E> {
    private Object[] items;
    private int size;
    private int capacity;

    public ArrayList() {
        size = 0;
        capacity = 10;
        items = new Object[capacity];
    }

    private void expand() {
    Object[] aux = new Object[capacity + 10];
        for (int i = 0; i < size; i++) {
            aux[i] = items[i];
        }
        capacity += 10;
        items = aux;
    }

    @Override
    public void add(E e) {
        if (size == capacity) {
        expand();
        items[size++] = e;
       }
    }

    @Override
    public E get(int index) {
      if (index < 0 || index >= size){
     return null;
  }
        return (E) items[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        E aux = (E) items[index];
     for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        size--;
        return aux;
    }

    @Override
    public int size() { 
return size; 
}

    @Override
    public void clear() {
  size = 0; 
capacity = 10; 
items = new Object[capacity]; 
}

    @Override
    public boolean isEmpty() {
 return size == 0; 
}

    @Override
    public void add(E e, int index) {
      if (index < 0 || index > size){
       return;
       }
        if (size == capacity) {
         expand();
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = e;
        size++;
    }
    }
