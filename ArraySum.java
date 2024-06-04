import java. util.*;
public class ArraySum {
    public static void main(String[] args) {
       // Write a Java program to calculate the average value of array elements.
        Scanner input = new Scanner(System.in);
        int [] numbers = new int []{1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for(int i = 0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("The average is : " + average);
        input.close();
    }
}
