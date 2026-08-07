import java.util.*;
public class practise {
    public static void main(String args[]) {
        // Scanner num = new Scanner(System.in);
        // int a = num.nextInt();
        // int b = num.nextInt();
        // int c = num.nextInt();
        // int sum = a+b+c;
        // int avg = sum/3;
        // System.out.println("average is :"+avg);
        // num.close();
 Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i=1;i<=5;i++){
        int m= number*i;
  System.out.println(number + " x " + i + "= " + m);
}
in.close();
    }
}
