public class Main {
    public static void main(String[] args) {
        int[] arr1 ={15,32,98,2,14,33};
        int[] arr2 ={1,2,8,28,74,9};
        int [] tong = new int[12] ;
        int count=0;

        for (int i = 0; i < arr1.length; i++) {
            tong[count] =arr1[i];
            count++;
//            System.out.print(arr1[i]+" ");
        }
        for (int j = 0; j < arr2.length; j++) {
            tong[count] =arr2[j];
            count++;
//            System.out.print(arr2[j]+" ");
        }   System.out.println("Mảng mới là:");
        for (int l = 0; l < tong.length; l++) {
            System.out.print(tong[l]+" ");
        }

    }
}