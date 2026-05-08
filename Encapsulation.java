public class Encapsulation{
 private String name;
 private int age;
 private double grade;
 
 public Encapsulation(String name,int age,double marks){
  this.name=name;
  setAge(age);
  setGrade(grade);
 }
 public String getName(){
  return name;
 }
 public int getAge(){
  return age;
 }
 public double getGrade(){
  return grade;
 }
 public void setName(String name){
  if(name!=null && !name.isEmpty()){
 this.name = name;
        }
    }
    
    public void setAge(int age){
        if(age>0 && age<105){
            this.age = age;
        }
    }
    
    public void setGrade(double grade){
        if(grade >= 0 && grade <= 100){
            this.grade = grade;
        }
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
    public static void main(String[] args){
        Encapsulation s1 = new Encapsulation("MD Bhai", 20 , 85.5);
        
        System.out.println("Student name" + s1.getName());
        
        s1.setAge(200);
        System.out.println("Age after invalid update: " + s1.getAge());
        
        s1.setGrade(92.3);
        
        s1.displayInfo();
        
        
        
    }    
}
