public class MultiArray {
    public static void main(String[] args) {

        String[][] naming = {
                {"Ram", "Shyam", "Krishna", "Mohan"},
                {"Sita", "Radha", "Rukmani", "Satyabhama"},
                {"Narsimha", "Hanuman", "Mahakal"}
            };

        for (int i = 0; i < naming.length; i++) {
            System.out.println(naming[i][0]);
            for (int j = 0; j < naming.length; j++) {
                System.out.println(naming[i][j]);

            }
            System.out.println();
        }
    }
}
