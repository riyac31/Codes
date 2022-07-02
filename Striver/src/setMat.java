import java.util.*;
public class setMat {
    static void sol(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int dum1[] = new int[n];
        int dum2[] = new int[m];
        Arrays.fill(dum1, -1);
        Arrays.fill(dum2, -1);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    dum1[i] = 0;
                    dum2[j] = 0;
                }
                //jjjjjjjjjjjjjjjjjjjjjj
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<n; j++){
                if(dum1[i] == 0 || dum2[j] == 0){
                    mat[i][j] = 0;
                }
            }
        }

    }

    public static void main(String args[]) {
        int mat[][] = {{1,0,1,8},{1,9,0,4},{1,2,1,0}};
        sol(mat);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}
