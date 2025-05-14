package practice;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10}; //sdfksdhfkjh34290
        change(num, arr);
        System.out.println("num = " + num); // 10
        System.out.println("arr[0] = " + arr[0]); // 20
    }

    public static void change(int n, int[] a) {
        n += 10;
        a[0] += 10;
        System.out.println("num = " + n); // 20
        System.out.println("arr[0] = " + a[0]); // 20
    }
}