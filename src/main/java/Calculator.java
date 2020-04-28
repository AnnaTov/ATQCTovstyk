import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a= Calculator.DataForA();
        double b= Calculator.DataForB();
        char x = Calculator.DataForX();
        Calculate(a,b,x);
    }
    public static double DataForA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        return sc.nextDouble();
    }
    public static double DataForB(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter b");
        return sc1.nextDouble();
    }
    public static char DataForX(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter  one of signs: + - / *");
        return sc2.next().charAt(0);
    }
    public static void Calculate(double a, double b, char x){
        switch(x){
            case '+':
                double sum= a+b;
                System.out.println(sum);
                break;
            case '-':
                double dif=a-b;
                System.out.println(dif);
                break;
            case '*':
                double multi=a*b;
                System.out.println(multi);
                break;
            case '/':
                double dev=a/b;
                System.out.println(dev);
                break;
            default:
                System.out.println("Input correct sign");
        }
    }
    }

