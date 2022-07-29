public class sum_param {
    static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);

    }

    public static void main(String[] args) {
        int i=3, sum=0;
        sum(i, sum);
    }
}
