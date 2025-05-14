package practice;

public class Avg {
    /**
     * 정수형 배열 scores에 5개의 점수를 저장한 후, 모든 점수의 평균을 구하여 출력하시오.
     * 평균은 정수형으로 출력해도 괜찮음.
     * 점수는 직접 코드에 넣으시오. ({85, 70, 90, 100, 60})
     */
    public static void main(String[] args) {
        int[] socres = {85, 70, 90, 100, 60};
        int sum = 0;
//        for (int i = 0; i < socres.length; i++) {
//            sum += socres[i];
//        }
        for (int k : socres) {
            sum += k;
        }
        System.out.println("배열의 합" + sum);
        int avg = sum / 5;
        System.out.println(avg);
    }
}
