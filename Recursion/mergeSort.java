public class mergeSort {
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void  divide(int arr[], int si,int ei){
        //base condition
        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        divide(arr, si, mid);  //for left part
        divide(arr, mid+1, ei); //for right array
        merge(arr, mid, si, ei);

    }

    public static void merge(int arr[],int mid, int si, int ei){
     int temp[] = new int[ei-si+1];
     int i =si; //for left
     int j = mid+1; //for right
     int k=0; //for temp

     while(i <= mid && j <= ei){

        if(arr[i] <= arr[j]){
            temp[k]= arr[i];
            i++;k++;

        }
        else
            {
            temp[k] =arr[j];
            j++;k++;
        }
        //left part
        while(i <= mid){
            temp[k++]= arr[i++];
        }

        //for right part
        while(j <= ei){
            temp[k++] =arr[j++];
        }

        for(k=0, i=si;k <temp.length;k++,i++){
            arr[i]= temp[k];
        }
     }
    }

    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        divide(arr, 0, arr.length-1);
        PrintArray(arr);


        
    }
}
