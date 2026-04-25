
import java.util.Scanner;

public class ArrayReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        for(int i =0 ;i < arr1.length; i++){
            arr1[i] = arr[arr1.length-i-1];
        }
        System.out.print("Before Reverse : ");
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nAfter Reverse : ");
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
            System.out.print(arr[i] +" ");
        }
    }
}