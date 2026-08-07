import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
   System.out.println("enter operator");
        char operator = sc.next().charAt(0); //sc.next take string value but here we need char.
        switch (operator) {
            case '+':System.out.println(a+b);
                break;
                case '-' :System.out.println(a-b);
                break;
                case '*':System.out.println(a-b);
                break;
                case '/':System.out.println(a/b);
                break;
        
            default:System.out.println("not able to solve");
                break;
        }
        sc.close();
    }
}
