import java.util.Random;

public class HW1T7 {
    public static void main(String[] args) {
        task7(5);
    }
    public static void task7(int a){
        //Напишите программу, которая выводит на экран сумму всех чисел массива
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
