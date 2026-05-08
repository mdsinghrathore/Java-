import java.util.Scanner;

public class Bubble{
    
    //bubble sort
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n]; //initialize 
        
        System.out.println("Enter the number of elements: ");
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        //sorting
        
        bubbleSort(arr);
	
        System.out.println("");
        System.out.println("Sorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
} 
