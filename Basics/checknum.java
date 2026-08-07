import java.util.Scanner;

public class checknum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
sc.close();
    }
}
