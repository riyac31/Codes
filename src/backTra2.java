public class backTra2 {
    static void print(int n){
        if(n<1)
            return;

        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
