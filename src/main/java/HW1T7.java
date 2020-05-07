import java.util.Random;
import java.util.Scanner;

public class HW1T7 {
    public static void main(String[] args) {
        //Напишите программу, которая выводит на экран сумму всех чисел массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a =sc.nextInt();

        Random rand = new Random();
        int [] array=new int[a];
        int sum=0;
        for( int i=0;i<array.length;i++){
            array[i]= rand.nextInt(10);
            sum=sum+array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println("\nSum is: "+ sum);
    }
}
