import java.util.*;
public class nto1 {
    static void print(int n){
        if(n<1)
            return;
        System.out.println(n);
        n--;
        print(n);
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

}
