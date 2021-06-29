import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Size of the
        // Arraylist
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli
                = new ArrayList<>(n);

        // Appending new element at
        // the end of the list
        for (int i =1;  i<= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove elements at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);

        // Printing element one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.println(arrli.get(i) + " ");

    }
}
