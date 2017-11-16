package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2,5,6,8,11,23,56,67,89,91,105 }; //Sorted
                    //0,1,2,3, 4, 5, 6, 7, 8, 9, 10, 11//
        int searchElement = 91;
        withoutRecursion(arr, searchElement);
        withRecursion(arr, searchElement,0 , arr.length);

    }
    
    private static void withRecursion(int[] arr, int searchElement, int low, int high) {
        
        if(high >= low){
            int mid = (low + high) /2;
            if(searchElement == arr[mid]){
                System.out.println("Found");
            }
            if(searchElement < arr[mid]) {
                withRecursion(arr, searchElement, low, mid-1);
            }
            if(searchElement > arr[mid]) {
                withRecursion(arr, searchElement, mid+1 , high);
            }
        }
        
    }

    public static void withoutRecursion(int[] arr, int searchElement){
        int low =0;
        int high = arr.length;

        while(low <= high){
        int mid = (low + high)/2;
         if(searchElement == arr[mid])
        {
            System.out.println("found");
            break;
        }
        if(searchElement < arr[mid]){
            high = mid-1;
        }
         if (searchElement > arr[mid]){
            low = mid+ 1;
        }

      }
    }
}
