import java.util.*;
public class rot90anti {
    static int n = 3;
    static void rot(int mat[][]){

        int temp[][] = new int[n][n];

        for(int i=0; i< n; i++)
            for(int j=0; j<n;j++)
                temp[n-j-1][i] = mat[i][j];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = temp[i][j];
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rot(mat);
        for(int i=0; i< n; i++){
            for(int j=0; j<n;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
