public class Main {
    public static void main(String[] args) {

  ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        System.out.println("La posicion 0 es : " + arr.get(0)); 
        System.out.println("La posicion 1 es : " + arr.remove(1)); 
        System.out.println("La posicion 5 es : " + arr.get(5)); 


        ListaEnlazada<String> list = new ListaEnlazada<>();
        list.add("X");
        list.add("Y");
        System.out.println(" La posicion 0 en la lista enlazda es : " + list.get(0));
        System.out.println("La posicion 1 en la lista enlazada es : " + list.remove(1)); 
        System.out.println("La posicion 5 en la lista enlazada es : " + list.get(5)); 
    }
}
