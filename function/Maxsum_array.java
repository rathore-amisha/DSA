public class Maxsum_array {
    public static void maxsum(int numbers[]){

    int currsum=0;
    int max_sum = Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
        int start = i;
        for(int j=i; j<numbers.length;j++){
            int end = j;
            currsum=0;
            for(int k= start;k<=end;k++){
                 currsum += numbers[k];
            }// } System.out.println(currsum);
            if(max_sum < currsum){
                max_sum = currsum;
            }
        }
    }
    System.out.println("maximum sum :"+max_sum);
}

public static void main(String args[]) {
    int num[] = {1,2,3,4};
    maxsum(num);
}
}
