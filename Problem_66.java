public class Problem_66 {
    public static int[] plusOne(int[] digits){
        int size = digits.length;

        for (int i = size -1 ; i >=0; i--){
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] anotherCase = new int[size + 1];
        anotherCase[0] = 1;
        for(int i = 1; i < anotherCase.length; i++){
            anotherCase[i] = 0;
        }
        return anotherCase;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);

        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++){
            if (i == result.length - 1){
                System.out.print(result[i]);
            } else {
                System.out.print(result[i] + " --> ");
                
            }
        }
        System.out.println();

    }
}
