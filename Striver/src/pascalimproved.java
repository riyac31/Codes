import java.util.*;
public class pascalimproved {
    static void pascal(int n){
        int[][] arr = new int[n][n];

         for(int i=0; i<n; i++){
             for(int j=0; j<=i; j++){
                 if(i==j || j==0)
                     arr[i][j] = 1;

                 else
                     arr[i][j] = arr[i-1][j-1]+arr[i-1][j];

                 System.out.print(arr[i][j]);
             }
             System.out.println(" ");

         }
    }

    public static void main(String[] args) {
        int n =5;
        pascal(n);
    }
}
