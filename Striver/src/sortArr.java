import java.util.*;
public class sortArr {
    static void sortA(int[] nums){
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]== 0)
                zero++;
            if(nums[i]== 1)
                one++;
            if(nums[i]== 2)
                two++;
        }
        for(int i=0; i<zero; i++){
            System.out.print(0+" ");
        }
        for(int i=0; i<one; i++){
            System.out.print(1+" ");
        }
        for(int i=0; i<two; i++){
            System.out.print(2+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums ={0,2,1,2,0,1,0,0,1};
        sortA(nums);
    }
}
