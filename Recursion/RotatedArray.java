//find the index of target element in the rotated sorted array

public class RotatedArray {
    public static int search (int arr[], int targ, int si, int ei) {
        if (si > ei) { // base case
            return -1;
        }
        // case found
        int mid = si + (ei - si) / 2;
        if (arr[mid] == targ) {
            return mid;
        }

        // case:a
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= targ && targ <= arr[mid]) {
               return search(arr, targ, si, mid - 1);
            } else {
               return search(arr, targ, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= targ && targ <= arr[ei]) {
                return search(arr, targ, mid + 1, ei);
            } else {

                return search(arr, targ, si, mid - 1);
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }
}