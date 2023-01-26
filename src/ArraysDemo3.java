import java.util.Arrays;

public class ArraysDemo3 {

    public static void main(String[] args) {


        int[][] matrix= {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0])); // print only column 0

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]); //using for prints column 0


        }
            int[] arr=matrix[0]; //prints complete first array column 0

    }
}
