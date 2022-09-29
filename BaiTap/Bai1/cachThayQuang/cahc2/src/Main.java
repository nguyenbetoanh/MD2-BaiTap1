import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng mảng");
        int arrLeght= Integer.parseInt(sc.nextLine());

        int []arr = new int[arrLeght];
        System.out.println("nhập các phần tử");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(sc.nextLine());
            System.out.print("arr "+i+"là: "+ arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Mảng ban đầu là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int[] newArr = new int[arrLeght+1];
        System.out.println("Nhập kí tự muốn thêm vào");
        int them = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí muốn thêm vào");
        int viTri = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <newArr.length ; i++) {
            if (i<viTri){
                newArr[i]=arr[i];
            } else if (i==viTri) {
                newArr[i]=them;
            }else
                newArr[i]=arr[i-1];
        }
        System.out.print("bảng mới sau khi thêm newArr là");

        for (int i = 0; i <newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}