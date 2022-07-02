import java.util.*;
public class pascalOpti {
    static void solution(int n){
        for(int i=0; i<n; i++){
            int c = 1;
            for(int j=1; j<=i; j++){
                c = c * (i-j+1)/j;
                System.out.print(c + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 8;
        solution(n);
    }
}
