import java.util.Scanner;
public class HW1T4 {
    public static void main(String[] args) {
        //Написать программу, которая проверяет, является ли число четным или нечетным.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a =  sc.nextInt();
        if ((a % 2) == 0) {
            System.out.println("Variable 'a' is an even number ");
        } else {
            System.out.println("Variable 'a' is not an even number ");
        }
    }}