package practice;

import java.util.Arrays;

public class Max {
    /**
     * 배열: {12, 7, 22, 5, 15}
     * - 반복문을 사용하여 최댓값(max)과 해당 인덱스(index)를 구하고 출력하세요.
     */
    public static void main(String[] args) {
        int[] arr = {12, 7, 22, 5, 15};
        int Max = 0;
        int Index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
                Index = i;
            }
        }
        System.out.println("가장 큰 값의 번호는" + Index + "이고"+ "최댓값은" + Max + "입니다.");
    }
}

