import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.List;

public class CollectionEx {
    public static void main(String[] args) {

        // Creating list of String

        ArrayList<String> names = new ArrayList<>();

        // Now we are adding the element in list
        names.add("Ram");
        names.add("Shyam");
        names.add("Mohan");

        for(String name : names) {

            System.out.println(name);
        }
        
    }
}
