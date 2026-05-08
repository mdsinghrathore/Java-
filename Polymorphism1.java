class Animal{
 void sound(){
  System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal{
 void sound(){
  System.out.println("Dog goes: woop woop");
 }
}
public class Polymorphism1{
 public static void main(String[] args){
  Animal a= new Dog();
  a.sound();
  Dog d =new Dog();
  d.sound();
  Animal b =new Animal();
  b.sound();
 }
}

