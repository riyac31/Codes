import java.util.*;
public class rotNaive {
    static void solution(int arr[], int d, int n){
        for(int i=0; i<d; i++){
            leftRotOne(arr, n);
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void leftRotOne(int arr[], int n){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
            arr[n-1] = temp;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = 5;
        solution(arr,d,n);
    }
}
