import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("nhap vao so hang");
        int row = sc.nextInt();
        System.out.println("nhap vao so cot");
        int col = sc.nextInt();

        int[][] arr2Chieu = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr2Chieu [" + i + "][" + j  +"] =");
                arr2Chieu[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }
        int arrMax = arr2Chieu[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arrMax < arr2Chieu[i][j]) {
                    arrMax = arr2Chieu[i][j];
                }
            }
        }System.out.println("Phần tử lớn nhất trong ma trận = " + arrMax);
    }
}