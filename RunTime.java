import java.util.Scanner;
class Payment{
 void pay(double amount){
   System.out.println("Payment aya hai: "+amount);
 }
}
class UPI extends Payment{
 @Override
 void pay(double amount){
   System.out.println("UPI aya hai: "+amount);
 }
}
class NEFT extends Payment{
 @Override
 void pay(double amount){
   System.out.println("Bank me aya hai: "+amount);
 }
}
public class RunTime{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the amount: ");
  double amount=sc.nextDouble();
  Payment p;
  p=new UPI();
  p.pay(amount);
  p=new NEFT();
  p.pay(amount);
  sc.close();
 }
}
