import java.util.Scanner;
public class Sort1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array");
  int a=sc.nextInt();
  System.out.println("Enter the elements of array");
  for(int i=0;i<a;i++){
   arr[i]=sc.nextInt();
  }
  System.out.println("Original array: ");
   for(int i=0;i<a;i++){
    System.out.print(arr[i]+" ");
   }
  for(int i=0;i<a;i++){
   for(int j=i+1;j<a;j++){
    if(arr[i]>arr[j]){
     int Temp=arr[j];
     arr[j]=arr[i];
     arr[i]=Temp;
    }
    else{
    }
   }
  }
  System.out.println("Sorted array: ");
  for(int i=0;i<a;i++){
   System.out.print(arr[i]+" ");
  }
 }
}
