public class HW1T3 {
    public static void main(String[] args) {
        task3(4,5,6);
        task3Ternary(4,6,7);
    }
    public static void task3(double a, double b, double c){
        //Написать программу, которая находит и выводит на экран максимальное из трех чисел.
        if( a>b && a>c){
            System.out.println(a);}
        else if(b>a && b>c){
            System.out.println(b);}
        else if(c>b && c>a) {
            System.out.println(c);}
        else {
            System.out.println("Some or all of the imputed numbers are the same");}
    }
    public static void task3Ternary(double a, double b, double c){
        double max=( a>b)?a:b;
        double max1=(max>c)?max:c;
        System.out.println(max1);}
}
