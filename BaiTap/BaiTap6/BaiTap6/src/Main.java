import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập hàng ngang");
        int row = Integer.parseInt(sc.nextLine());

        System.out.println("Hãy nhập hàng dọc");
        int col = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[row][col];
        System.out.println("Nhập các phần tử ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Arr[" + i + "][" + j + "] ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.print("\n");
        }
        System.out.println("nhập số cột muốn tính tổng");
        int cot = Integer.parseInt(sc.nextLine());
        int tongRow=0;
        System.out.println("in mảng : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + arr[i][j] + "]" + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if ( cot==0) {
                    tongRow += arr[i][j] ;
                    j=col;
                } else if (cot==1) {
                    tongRow += arr[i][1];
                    j=col;
                } else if (cot==2) {
                    tongRow += arr[i][2];
                    j=col;
                } else if (cot==3) {
                    tongRow += arr[i][3];
                    j=col;
                } else if (cot==4) {
                    tongRow += arr[i][4];
                    j=col;
                }else
                    System.out.println("nhap so cot lai");
            }

            }System.out.println("tong cot la : "+tongRow);
        }

    }
