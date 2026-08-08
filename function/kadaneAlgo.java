import java.util.*;

public class kadaneAlgo {
    public static void kadane(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            currsum = currsum + num[i];

            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);

        }
        // for every element of array is negative - get smallest -ve num.

        // int mini=num[0];
        // for(int i=1 ;i< num.length;i++){
        //     if(mini < num[i]){
        //         mini = num[i];
        //     }
        // }
        // System.out.println("maxsum of subarray: "+mini);
        
        System.out.println("The max sum of subarray is :" + maxsum);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];
        System.out.println("enter the element of array :");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array :" + Arrays.toString(array));
        sc.close();
        kadane(array);
    }
}
