import java.util.*;
public class nto1 {
    static void print(int n){
        if(n>5)
            return;
        System.out.println(n);
        n++;
        print(n);
    }

    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
}
