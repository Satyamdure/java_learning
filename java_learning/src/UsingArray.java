public class UsingArray {
    public static void main(String[] args) {
        double[] myList = {2.3, 3.2, 4.6, 0.8};

        //Printing Array element

        for (int i = 0; i < myList.length; i++) {
            System.out.println("myList: " + myList[i]);
        }
        //Summing the array elements
        double total = 0;

        for(int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is: "+ total);
    }
}
