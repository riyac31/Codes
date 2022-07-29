import java.util.*;
public class print_all_subseq {
    static void print(int ind, ArrayList<Integer> subs, int arr[]){
       if(ind>=arr.length)
       {
           if(subs.size()>0){
               System.out.println(subs);
           }
           return;
       }
       subs.add(arr[ind]);
       print(ind+1, subs, arr); //take
        subs.remove(arr[ind]);
        print(ind+1, subs, arr);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1};
        int n = arr.length;
        ArrayList<Integer> subs = new ArrayList<>();
      print(0, subs, arr);

    }
}
