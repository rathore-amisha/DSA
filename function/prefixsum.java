import java.util.*;
public class prefixsum {
    public static void maxsum(int num[]){
        
        int currsum = 0;
        int Max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0]= num[0];
        // calculate the sum of prefix index
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(Max_sum < currsum){
                     Max_sum = currsum;
                }
            }
        }
        System.out.println("maximum sum of array :"+Max_sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");

        int size= sc.nextInt();

        int num[]= new int [size];
        for(int i=0;i< size;i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("entered Array :" +Arrays.toString(num));
        // int numbers[] ={1,2,3,4,5};
        maxsum(num);
    }
}
