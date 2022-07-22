import java.util.*;
public class backTra1 {
    static void print(int n){
        if(n<1)
            return;
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
