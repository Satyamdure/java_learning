import java.util.HashMap;
import java.util.Map;

public class MapUsing {
    public static void main(String[] args) {

        //Create a HashMap
        Map<String, Integer> studentMarks = new HashMap<>();

        //Add key, value pair
        studentMarks.put("Ram", 97);
        studentMarks.put("Pradeep", 87);
        studentMarks.put("Anshuman", 90);
        studentMarks.put("Satyam", 83);

        //Retrive the value
        int pradeepMarks = studentMarks.get("Pradeep");
        System.out.println("Pradeep's marks : " + pradeepMarks);

        //Check if key exist
        boolean satyamContains = studentMarks.containsKey("Satyam");
        System.out.println("Does the map contain Satyam's marks : " + satyamContains);

        //Iterate over the map
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String student = entry.getKey();
            int marks = entry.getValue();

            System.out.println(student + " : " + marks);

        }
    }
}
