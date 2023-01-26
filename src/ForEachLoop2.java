import java.sql.SQLOutput;

public class ForEachLoop2 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        arr[1]=0;
        arr [3]=0;
        arr[4]=0;

        for (int i = 0; i <arr.length ; i++) {

                System.out.println(arr[i]);
            }




    }
}
