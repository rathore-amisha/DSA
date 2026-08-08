import java .util.*;
public class basic{
    public static void  calculatesum(int a,int b){
       int sum =a+b;
       System.out.println("sum is :"+sum);
    }
    public static int multiply(int a, int b){
        int product;
        product=a*b;
        System.out.println("multiplication :"+product);
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        calculatesum(a,b);

        multiply(3,5);
        sc.close();
    }
}