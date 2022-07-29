public class rec2 {

    static void print(int n){
        if(n==4)
            return ;
        System.out.println(n);
        n++;
        print(n);
    }

    public static void main(String[] args) {
        int n = 0;
        print(n);
    }
}
