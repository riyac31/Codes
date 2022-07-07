import java.util.*;
public class stockOpti {
    static int solution(int[] prices){
        int minCost = prices[0];
        int maxProfit = 0;
        for(int i=0; i< prices.length; i++){
            minCost = Math.min(minCost, prices[i]);
            maxProfit = Math.max(maxProfit, (prices[i]-minCost));
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(solution(prices));
    }
}
