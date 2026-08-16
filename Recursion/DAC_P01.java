// Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in
// all the Strings are in lowercase). (EASY)

// Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
// Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}

public class DAC_P01{

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // left part
        mergeSort(arr, si, mid);
        // right part
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int i = si;       // left pointer
        int j = mid + 1;  // right pointer
        int k = 0;        // temp pointer

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(String arr[]) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};

        mergeSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}
