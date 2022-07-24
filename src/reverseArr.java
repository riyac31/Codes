public class reverseArr {
    static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l]+arr[r];
        arr[r] = arr[l]-arr[r];
        arr[l] = arr[l]-arr[r];
    }

    static void rev(int[] arr, int l, int r) {
        if (l>=r)
            return;
            swap(arr, l, r);
            rev(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
    rev(arr, 0, n-1);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}