public class P_2433 {
    public static int[] findArray(int[] pref) {

        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 0, 3, 1 };
        int[] ans = findArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
