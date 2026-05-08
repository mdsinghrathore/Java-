class Java{
 void Subject(){
  System.out.println("Java hai");
 }
}
class Ha extends Java{
  @Override
  void Subject(){
   System.out.println("Aur bhi subject padhlo");
  }
}
class Na extends Java{
 @Override
 void Subject(){
  System.out.println("Aur koi subject mat padho");
 }
}
public class Polymorphism{
 int multiply(int a,int b){
  return a*b;
 }
 int multiply(int a,int b,int c){
  return a*b*c;
 }
 int multiply(int a,int b,int c,int d){
  return a*b*c*d;
 }
 public static void main(String[] args){
  Polymorphism p1=new Polymorphism();
  System.out.println(p1.multiply(10,20,30));
  Java j;
  j= new Ha();
  j.Subject();
  j=new Na();
  j.Subject();
 }
}
