import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Mohan");

        System.out.println("Array List : " + names);

        // LinkedList Example
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(34);
        numbers.add(23);

        System.out.println("Linked List : " + numbers);


    }
}
