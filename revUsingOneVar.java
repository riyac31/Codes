import java.util.*;
public class revUsingOneVar {
    static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l]+arr[r];
        arr[r] = arr[l]-arr[r];
        arr[l] = arr[l]-arr[r];
    }
    static void solution(int i, int[] arr, int n){
        if(i>=n/2)
            return;
        swap(arr, i, n-i-1);
        solution(i+1, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int n = arr.length;
        solution(i, arr, n);
        for( i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
