public class largest {
    public static int largest_num(int num[])
    { int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }System.out.println("smallest number :"+smallest);


return largest;
    }

    public static void main(String args[]){
        int num[] ={ 4,5,8,7,6};
        System.out.println("largest number :"+largest_num(num));
    }
}
