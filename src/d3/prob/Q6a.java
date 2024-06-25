package d3.prob;

import java.util.Scanner;

public class Q6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxIdx = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[maxIdx] < nums[i]) {
                maxIdx = i;
            }
        }
        System.out.println(maxIdx);
    }
}
