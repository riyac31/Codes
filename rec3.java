import java.util.*;
public class rec3 {
    static void print(int n){
        if(n>5)
            return;

            System.out.println("Riya Choudhary");
            n++;
            print(n);

    }

    public static void main(String[] args) {
        int n = 1 ;
        print(n);
    }
}
