package employee;

import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        
        long expectedSum = (long)(N + 1) * (N + 2) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        
        long missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);

        scanner.close();
    }
}
