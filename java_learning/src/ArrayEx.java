public class ArrayEx {
    public static void main(String[] args) {

        int[][] numMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //System.out.println(numMatrix.length);
        for (int i = 0; i < numMatrix.length; i++) {
            //System.out.println(numMatrix[i][i]);

            for(int j = 0; j < numMatrix.length; j++) {
                System.out.println(numMatrix[j][j]);

            }
        }



//        for (int i = 0; i < numMatrix.length; i++) {
//            for (int j = 0; j < numMatrix.length; j++) {
//
//                System.out.print(numMatrix[i][j]);
//            }
//           //System.out.println();
//        }

//       int[] marks = {85, 90, 78, 88, 76};
//        int total = 0;
//        for (int mark : marks) {
//            total += mark;
//        }
//        System.out.println("Average Marks: " + (t otal / marks.length));
    }
}

