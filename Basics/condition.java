import java.util.Scanner;

public class condition {
    public static void main(String[] args){
        // int age =16;
        // if(age >= 18){
        //     System.out.println("can vote,drive");
        // }if(age > 13 && age <=19){
        //        System.out.println("teenager");
        // }else{
        //     System.out.println("not adult");
        // }

        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the number ");
      int num = sc.nextInt();
      if(num %2 == 0){
        System.out.println("even");
      }else{
        System.out.println("odd");
      }
      sc.close();
        
    }
}
