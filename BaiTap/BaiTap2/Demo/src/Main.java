import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhập số cần thêm vào mảng !");
        int x= sc.nextInt();

        System.out.println("Nhập ví trí cần thêm");
        int viTri=sc.nextInt();

        int [] array = new int[9];
        array[0]=1;
        array[1]=1121;
        array[2]=11;
        array[3]=13;
        array[4]=145;
        array[5]=17;
        array[6]=19;
        array[7]=15;

        int doDaiMang=array.length-1;

        doDaiMang++;
        for (int i =array.length-1 ;i>viTri; i--) {
            array[i]=array[i-1];
        }
        array[viTri]=x;
        System.out.println("Độ dài mạng sau khi thêm là :");
        for (int i = 0; i <doDaiMang ; i++) {

            System.out.print(array[i]+" ");


        }
    }
}