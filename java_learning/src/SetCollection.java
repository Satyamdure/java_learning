import java.util.*;

public class SetCollection {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Narsihma");
        names.add("Krishna");

        System.out.println("HashSet : " +names);

        for(String s: names) {
            System.out.println(s);
        }


        Set<Integer> num = new TreeSet<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        System.out.println("TreeSet : "+ num);

        for(Integer n: num) {
            System.out.println(n);
        }


    }
}
