import java.util.*;
public class fibonacci {
    static int solution(int n){
        if(n==0 || n==1)
            return n;
        return solution(n-1)+solution(n-2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }
}
