public class TestArray2 {
    public static void main(String[] args) {


        String[] schoolbag = new String[4];

        schoolbag[0] = "Book";
        schoolbag[1] = "pen";
        schoolbag[2] = "pencil";
        schoolbag[3] = "copy";

        String[] schoolbag1 = {"Book", "pen", "pencil", "copy"};
        int size = schoolbag1.length;


        for (int i = 0; i < size; i++) {
            System.out.println(schoolbag1[i]);


        }
    }
}
