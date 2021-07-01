import java.util.LinkedList;

class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add("E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
