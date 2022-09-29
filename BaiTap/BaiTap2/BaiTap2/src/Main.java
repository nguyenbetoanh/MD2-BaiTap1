import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số cần thêm vào mảng !");
        int x = sc.nextInt();

        System.out.println("Nhập ví trí cần thêm");
        int viTri = sc.nextInt();

        int[] array = {23, 65, 4, 6, 8, 7, 9, 2};
        int doDaiMang= array.length;
        for (int i = viTri; i < array.length; i++) {
            array[i] = array[i + 1];


        }doDaiMang--;

        System.out.println("Độ dài mạng sau khi xóa là :");
        for (int i = 0; i <doDaiMang ; i++) {
            System.out.print(array[i]+" ");

    }
}
}