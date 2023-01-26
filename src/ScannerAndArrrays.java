import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrrays {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int [] name=new int[5];
/*
        name[0]= scan.nextInt();
        name[1]= scan.nextInt();
        name[2]=scan.nextInt();
        name[3]=scan.nextInt();
        name[4]=  scan.nextInt();*/

        for (int i = 0; i < name.length; i++) {
            name[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(name));





    }
}
