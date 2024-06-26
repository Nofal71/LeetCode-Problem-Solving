import java.util.List;

public class P_2824 {

    public static int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        int n = nums.size();
        // size() is used to get length of list

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums.get(i) + nums.get(j) < target) {
                    pairs++;
                }
            }
        }
        return pairs;

    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(-1, 1, 2, 3, 1);
        int target = 2;

        System.out.println(countPairs(nums, target));
    }
}