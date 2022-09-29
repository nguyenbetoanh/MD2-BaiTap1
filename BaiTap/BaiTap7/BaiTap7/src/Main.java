import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập số dòng!");
        int row = Integer.parseInt(sc.nextLine());

        System.out.println("Hãy nhập số cột !");
        int col = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[row][col];
        System.out.println("nhập các dữ liệu : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Arr[" + i + "][" + j + "]:");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.print("\n");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + arr[i][j] + "]" + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("=========================================================================================");


        do {


            System.out.println("*******chọn đường chéo********");
            System.out.println("1 -Đường chéo từ trái qua phải");
            System.out.println("2 -Đường chéo từ phải qua trái");
            System.out.println("3 thoát");
            int tong = 0;
            System.out.println("chọn số");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == j) {
                                tong += arr[i][j];
                            }
                        }
                    }
                    System.out.println("tong duong cheo trái sang  phai la : " + tong);
                    break;
                case 2:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (
                                    (i == 0 && j == (col - 1)) ||
                                    (i == (row - 1) && j == 0) ||
                                    (i == j && i != 0 && j != (col-1))
//                                    i+j> arr.length-1
                            ) {
                                tong += arr[i][j];

                            }
                        }
                    }
                    System.out.println("tong duong cheo  phai sang trái la : " + tong);
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);

    }
}