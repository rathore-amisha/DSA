public class binary {
    public static int binary_search(int num[] , int key){
        int start=0;
        int end= num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(num[mid] == key){
                return mid;
            }if(num[mid] >key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }

    public static void main(String args[]){
        int n[]={4,6,8,10,12,14,19};
        int key=10;

        System.out.println("index of key :"+binary_search(n, key));
    }
}
