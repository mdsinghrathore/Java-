class Amount{
 void accountType(){
  System.out.println("Bank Account");
 }
}
class SavingAccount extends Amount{
 void intrest(){
  System.out.println("Saving account provides intrest");
 }
}
class SalaryAccount extends Amount{
 void overDraft(){
  System.out.println("salary/current acc allows over draft");
 }
}
public class Heirarchial{
 public static void main(String[] args){
  SavingAccount sa1=new SavingAccount();
  SalaryAccount sa2=new SalaryAccount();
  sa1.accountType();
  sa1.intrest();
  sa2.accountType();
  sa2.overDraft();
 }
}
