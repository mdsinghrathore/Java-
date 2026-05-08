abstract class Mahindra{
 abstract void electric();
 abstract void deisel();
}
class Electric extends Mahindra{
 @Override
 void electric(){
  System.out.println("BE6e-25.00 lacks");
 }
 @Override
 void deisel(){
  System.out.println();
 }
}
class Deisel extends Mahindra{
 @Override
 void deisel(){
  System.out.println("Bolero-10.00 lacks");
 }
 @Override
 void electric(){
  System.out.println();
 }
}
public class Abstract{
 public static void main(String[] args){
  Mahindra e=new Electric();
  Mahindra d=new Deisel();
  
  e.electric();
  d.deisel();
 }
}
