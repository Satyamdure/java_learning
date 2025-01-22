public class StringExample {

    static String str = "Ram";


    StringExample() {
        System.out.println();



    }

    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Original String : " + str);

        //Length of the String
        System.out.println("String lenght : " + str.length());

        //Character at the 7 index
        System.out.println("Character : " + str.charAt(7));

        //SubString
        System.out.println("SubString : " + str.substring(7));

        //String replace
        System.out.println("String replacing : " + str.replace("Hello", "World"));

        // Convert to upper case
        System.out.println("Uppercase : " + str.toUpperCase());

        String sub = str.substring(2, 6);
        System.out.println("Sub : " + sub);

        char chr = 'a';
        int var = 100;
        String naming = "Ram";

        System.out.println(chr + var + naming);
    }
}

