public class NewTasks {
    public static void main(String[] args) {
        //home4(3,4,12);
       // isSquare(11);
        //task6();
        getCount();
    }

    public static void home1(){
        String admin= "John", name;
        name=admin;
        System.out.println(name);
    }

    public static void home2(int a,int b){
        System.out.println(a-b);

    }

    public static void home3(int a, int b, int c){
        if (a>b&&a>c){
            System.out.println(a);
        }
       if(b>a&&b>c){
            System.out.println(b);
        }
        if(c>a&&c>b){
            System.out.println(c);
        }
        else {
            System.out.println("Something went wrong");
        }}

    public static boolean isSquare(int n) {
        if (Math.sqrt(n) % 1 == 0)  {
            return true;
        }
        else{
            return false;
            }
        }

    public static void task4(float a){
        if (a%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        }

    public static void task5() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
    public static void task6(){
        for (int i=1;i<=10;i++){
            System.out.println("7*"+i+"="+(7*i));
        }
    }
    public static void getCount() {
        String str = "abracadabra";
        int vowelsCount = 0;
        for(int i = 0; i <str.length(); i++){
            char a = str.charAt(i);
            System.out.println(a);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                vowelsCount++;
            }

        }
        // your code here
        System.out.println(vowelsCount);
    }
    }

