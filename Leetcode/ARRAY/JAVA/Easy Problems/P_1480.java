public class P_1480 {

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] sumArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }

        return sumArray;
    }

    public static void runArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = runningSum(nums);
        runArray(result);

    }

}