class Animal{
 void eat(){
  System.out.println("From animal class : animal is eating");
 }
}
class Dog extends Animal{
 void bark(){
  System.out.println("From subClass1(dog class): dog is barking");
 }
}
class Puppy extends Dog{
 void play(){
  System.out.println("Puppy class : leo is playing");
 }
}
public class Test{
 public static void main(String[] args){
  Puppy p=new Puppy();
  p.eat();
  p.bark();
  p.play();
 }
}
 
