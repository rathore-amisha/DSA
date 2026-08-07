import java.util.*;
public class factorial {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number :");
    int n= sc.nextInt();

    // int fact = 1;
    // for(int i=1;i<=n;i++){
    //     fact= fact*i;
    // }
    // System.out.println("factorial of a number : "+fact);

    //multiplication
    for(int i =1; i<=10;i++){
        System.out.println(n+"*"+i +"="+n*i);
    }
    sc.close();
    }
}
