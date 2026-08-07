import java.util.*;
public class sumOddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int num;
            int choice;
            int evensum=0;
            int oddsum = 0;

            do{
                System.out.print("Enter he number:");
                 num = sc.nextInt();

                if(num % 2 == 0){
                   evensum = evensum +num;
                }else{
                    oddsum = oddsum +num;
                }
                System.out.print("for continue press 1 ,for exit press any key");
                choice = sc.nextInt();
            }while(choice == 1);
            System.out.println("sum of even number :"+evensum);
            System.out.println("sum of odd number :"+oddsum);
            sc.close();
    }
}
