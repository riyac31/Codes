import java.util.*;
public class D1Q1 {
    static void setMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    int ind = i-1;
                    while(ind>0){
                        if(matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i+1;
                    while(ind<n){
                        if(matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    int ind2 = j+1;
                    while(ind2<m){
                        if(matrix[i][ind2] != 0){
                            matrix[i][ind2] = -1;
                        }
                        ind2++;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] < 0)
                    matrix[i][j] = 0;
              
            }
        }

    }

    public static void main(String[] args) {
        
        int[][] matrix = {{1,0,},{1,1,1},{1,1,1}};
        int n = matrix.length;
        int m = matrix[0].length;
        setMatrix(matrix);
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               System.out.println(matrix[i][j]);
           }
       }
    }
}
