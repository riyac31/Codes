import java.util.*;
public class pascalBrute {
    static int binomialCoeff(int n, int r){
        int res = 1;
        if(r>n-r)
            r = n-r;
        for(int i=0; i<r; ++i){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
    static void printPascal(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(binomialCoeff(i,j)+" ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 7;
        printPascal(n);

    }
}
