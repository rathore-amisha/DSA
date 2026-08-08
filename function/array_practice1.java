//given an integer array num ,return true if any value appears at least twice
// in the array and return false,if every element is distinctive.

import java.util.Scanner;

public class array_practice1 {
    public static boolean returnTwice(int num[]){

        for(int i=0;i<num.length-1;i++){
            for (int j=i+1;j<num.length;j++){
                if(num[i] == num[j]){
                    return true;
                    
                }
                    
                }
            }
                return false;
            
        }
                
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num[] = new int[4];
        System.out.println("enter the element of array :");
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }sc.close();

        System.out.println(returnTwice(num));
    }
}

