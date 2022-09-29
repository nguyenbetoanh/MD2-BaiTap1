import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner delete = new Scanner(System.in);
        System.out.println("nhap vào phần từ cần xóa");
        int x = delete.nextInt();


        int[] array = {1, 2, 88, 6, 4, 9, 5};
        int viTri = -1;
        int doDaiMang = array.length;


        for (int i = 0; i < array.length - 1; i++) {
            if (x == array[i]) {
                viTri = i;
                System.out.println("phần tử vừa nhập nằm ở vị trí :" + viTri);
                break;
            }
        }
        if (viTri == -1) {
            System.out.println("không có phần tử nào trong đó cả");
        }
        for (int i = viTri; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
          doDaiMang--;
        System.out.println("Độ dài mạng sau khi xóa là :");
        for (int i = 0; i <doDaiMang ; i++) {
            System.out.print(array[i]+" ");

        }
    }
}