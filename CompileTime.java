public class CompileTime{
 int add(int a,int b){
  return a+b;
 }
 double add(double a,double b){
  return a+b;
 }
 int add(int a,int b,int c){
  return a+b+c;
 }
 public static void main(String[] args){
  CompileTime c=new CompileTime();
  System.out.println(c.add(10,20));
  System.out.println(c.add(20,40,28));
  System.out.println(c.add(37.372,29.38));
 }
}
