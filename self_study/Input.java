import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] numbers = str.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i ++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        for (int num : nums) {
            String temp = String.format("%d ", num);
            System.out.print(temp);
        }
        System.out.println();
    }
}