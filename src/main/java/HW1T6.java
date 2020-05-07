public class HW1T6 {
    public static void main(String[] args) {
        task6();
        task6WithWhile();

    }
    public static void task6(){
        //Вывести на экран таблицу умножения на 7
        for (int i=1;i<=10;i++){
            System.out.println(("7*"+i+"="+(7*i)));}
    }
    public static void task6WithWhile(){
        int i=0;
        while(i<=10){
            System.out.println(("7*"+i+"="+(7*i)));
            i++;
        }
    }
}
