import java.util.*;
public class stockBrute {
    static int solution(int[] nums){
        int maxPro = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>nums[i])
                    maxPro = Math.max((nums[j]-nums[i]),maxPro);
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(nums));
    }
}
