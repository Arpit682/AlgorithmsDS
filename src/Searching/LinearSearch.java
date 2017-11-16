package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {4,2,1,5,6,3,7,8,3,1,56,24,7,12};
        int item = 6;
        for(int i=0; i<a.length; i++){
            if(a[i] == item){
                System.out.println(item + " found at " + (i+1));
            }
            
        }
    }

}
