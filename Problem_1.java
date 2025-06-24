public class Problem_1 {

    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 13, 17, 23};
        int target = 30;

        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
    }

}