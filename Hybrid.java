import java.util.Scanner;
public class Hybrid{ 
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the initial amount: ");
  double initialBalance=sc.nextInt();
   
  Bank bank=new Bank(initialBalance);
   
  System.out.println("Choose the payment way:(enter the option no) ");
  System.out.println("1. UPI ");  
  System.out.println("2. NEFT");
  int i=sc.nextInt();
    
  System.out.println("Choose transaction:(enter the option no) ");
  System.out.println("1. Withdraw");
  System.out.println("2. Deposite");
  int j=sc.nextInt();
   
  if(i==1){
   Paytm p =new Paytm(bank.amount);
   System.out.println("Enter the UPI ID: ");
   p.upiID= sc.next();    
  
   if(j==1){
    System.out.println("Enter the withdrawal amount: ");
    p.withdrawal(sc.nextDouble());
   }
   else{
    System.out.println("Enter the deposite amount: ");
    p.deposite(sc.nextDouble());
   }
  }
  else{
   NEFT n=new NEFT(bank.amount);
   System.out.println("Enter the MPIN: ");
   n.mPin=sc.nextInt();
   
   if(j==1){
    System.out.println("Enter withdrawal amount: ");
    n.withdrawal(sc.nextDouble());
   }
   else{
    System.out.println("Enter deposite amount: ");
    n.deposite(sc.nextDouble());
   }
  }
 }  
}
class Bank{
 double amount;
 Bank(double amount ){
  this.amount=amount;
 }
 void withdrawal(double withdrawAmount)
 {
  if(withdrawAmount<=amount){
   amount-= withdrawAmount;
   System.out.println("Withdrawal: "+withdrawAmount);
  }
  else{
   System.out.println("insufficiant balance");
  }
  System.out.println("Balance: "+amount);
 }
 void deposite(double depositAmount)
 {
  amount+= depositAmount;
  System.out.println("Deposited: "+depositAmount);
  System.out.println("Balance: "+amount);
 }
}
class NEFT extends Bank{
 int mPin;
 NEFT(double amount){
  super(amount);
 }
}
class UPI extends Bank{
 String upiID;
 UPI(double amount){
  super(amount);
 }
}
class Paytm extends UPI{
 int paytmID;
 Paytm(double amount){
  super(amount);
 }
}
