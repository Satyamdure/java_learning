import java.util.ArrayList;

public class UsingGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add("Hello");

        String str = (String) list.get(1);

        System.out.println(str);
        System.out.println(list);

    }
}
