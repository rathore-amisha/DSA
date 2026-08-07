import java.util.*;
public class incometax {
    public static void main(String[] args){
        int tax;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the income");

      int income = sc.nextInt();

      if(income <= 500000){
         tax = 0;
        System.out.println("tax free");
      }else if(income >= 500000 && income <=1000000){
              tax= (int)(income*(0.2));
              System.out.println("tax is :"+tax);
      }else{
        tax =(int) (income*0.3);
        System.out.println("tax for more than 1ol :"+tax);
      }
sc.close();
    }
}
