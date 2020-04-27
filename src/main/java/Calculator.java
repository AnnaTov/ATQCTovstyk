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
        double a = sc.nextDouble();
        return a;
    }
    public static double DataForB(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter b");
        double b = sc1.nextDouble();
        return b;
    }
    public static char DataForX(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter  one of signs: + - / *");
        char x = sc2.next().charAt(0);
        return x;
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
                System.out.println("Input correct parameter");
        }
    }
    }

