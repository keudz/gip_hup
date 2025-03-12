package test;

import java.util.Arrays;

public class SpecialTriangle {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        printSpecialTriangle(A);
    }

    public static void printSpecialTriangle(int[] A) {
        // In hàng đầu tiên của tam giác
        System.out.println(Arrays.toString(A));

        // Nếu chỉ có một phần tử, kết thúc
        if (A.length == 1) {
            return;
        }

        // Tạo hàng tiếp theo bằng cách tính tổng hai phần tử liên tiếp
        int[] nextRow = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            nextRow[i] = A[i] + A[i + 1];
        }

        // Đệ quy với hàng mới
        printSpecialTriangle(nextRow);
    }
}
