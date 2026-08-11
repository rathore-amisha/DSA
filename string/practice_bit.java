public class practice_bit {
    public static int pract1(int n){
        return n^n;
    }

    public static void practice_02(int a,int b){ //swap two number without using third variable
         System.out.println("Before swap:");
        System.out.println("a = " + a + ", b = " + b);
       a= a^b;
       b= a^b;
       a=a^b;
        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        System.out.println(pract1(5));
        practice_02(5, 3);
    }
}
