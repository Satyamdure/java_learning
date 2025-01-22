public class StringManipulation {
    public static void main(String[] args) {

        // Use of StringBuilder(for single-threaded environment)

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(",");
        sb.append("World");
        System.out.println(sb.toString());

        // Use of StringBuffer (for multi-threaded environment)

        StringBuffer sbf = new StringBuffer("java");

        sbf.insert(2,"Script");
        sbf.append("world");
        System.out.println(sbf.toString());


    }
}
