public class LinearSearch {
    public static void main(String[] args) {
        int[]  a = {1, 2, 3, 4,5};
       int x=search(a, 5);
        System.out.println(x);
    }

    static int search(int[] arr, int k) {
        int n = arr.length;
       int b = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                b = 1;
            }

        }
        return b;
    }
}




