
public class RecBasic {
public static void printDec(int n){
    if(n == 1){
        System.out.println("1");
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
}
public static void PrintInc(int n){
    if(n == 1){
        System.out.print("1");
        return;
    }PrintInc(n-1);
    System.out.print(n+" ");
    
}

//factorial
public static int factorial(int n){
    if(n == 0){  //base condit.
        return 1;
    }
    int fact = n*factorial(n-1);
    return fact;
}

//sum of first n natural number
public static int calcSum(int n){
    if(n == 0 || n == 1){
        return 1;
    }
    int sum = n + calcSum(n-1);
    return sum;
}

//check array is sorted or not
public static boolean isSorted(int arr[],int i){
    if(i == arr.length-1){
        return true;
    }if(arr[i]>arr[i+1]){
        return false;
    }
    return isSorted(arr,i+1);
}

//first coourence
public static int firstOccur(int arr[],int key,int i){
    if(i == arr.length-1){
        return -1;
    }if(arr[i] == key){
        return i;
    } return firstOccur(arr, key, i+1);
}

//last occurance
public static int lastOccur(int arr[],int key,int i){
    if(i == arr.length){
        return -1;
    }
    int isFound = lastOccur(arr, key, i+1);
    if(isFound == -1 && arr[i] == key){
        return i;
    }
    return isFound;
}

//power
public static int pow(int x,int n){
    if(n == 0){
        return 1;
    }
    return x*pow(x,n-1);
}
    public static void main(String[] args) {
        // int n=10;
        // printDec(n);
        // PrintInc(n);
        // System.out.println(factorial(5));
        // System.out.println(calcSum(5));

        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr, 1));

        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccur(arr, 5, 0 ));
        System.out.println(lastOccur(arr, 5, 0));

        System.out.println(pow(2, 5));
    }
}