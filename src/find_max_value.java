import java.util.Scanner;

public class find_max_value {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner scanner = new Scanner(System.in);
//    Check độ dài của mảng
        do{
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }

        }while (size > 20);
//        Nhập các phần tử mảng
        arr = new int[size];
        int i = 0;
        while (i < arr.length ){
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        //in ra các phần tử vừa nhập
        System.out.println("Element list: " );
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
//        Tìm vị trí lớn nhất
        int max = arr[0];
        int position = 1;
        for( int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                position = j + 1;
            }
        }
        System.out.println("Max value in array is: " + max + " at position " + position);

    }
}
