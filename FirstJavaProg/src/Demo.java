import java.util.Arrays;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        System.out.println("****Intro****");
        System.out.println("Hello Gayathri Welcome!...");
        System.out.println("****Date****");
        Date now = new Date();
        System.out.println(now);
        System.out.println("****Array****");
        int[] numbers = {12, 4, 5, 22, 56, 44, 29};
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers are:"+Arrays.toString(numbers));
        System.out.println("*****2*2 Matrix*****");
        int[][] number = new int[2][2];//2*2 matrix
        number[0][0] = 1;
        System.out.println("Array:"+Arrays.deepToString(number));
        //Arithmetic Operators
        System.out.println("*****Arithmetic Operators*****");
        int result = 25+25;
        System.out.println("Sum:"+result);
        double div = (double)10/(double) 3;
        System.out.println("Div:"+div);


    }

}

