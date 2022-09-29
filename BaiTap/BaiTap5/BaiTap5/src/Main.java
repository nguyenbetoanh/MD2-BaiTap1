import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập dộ dài mảng!");
        int row = sc.nextInt();
        int[] arr = new int[row];

        for (int i = 0; i < row; i++) {
            System.out.print("arr [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < row; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị mid là : " + min);
    }
}