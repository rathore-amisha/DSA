import java.util.*;
public class enterNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
              System.out.println("Enter the number");
              int n = sc.nextInt();
              if(n % 10 == 0){
                break;
                // continue;
              }
              System.out.println("number was :"+n);   
              sc.close();
        }while(true);
        
 }
    
}
