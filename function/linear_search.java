public class linear_search {
    public static int linSearch(int numbers[], int key){
          for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
            
          }return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,6,8,7,14,10,19,20};
        int key=10;
        int index=linSearch(numbers, key);
        if(index == -1){
            System.out.println("key not  found  ");
        }else{
            System.out.println("key  found at index :"+index);
        }

    }
}
