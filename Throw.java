public class Throw{
	public static void main(String[] args){
		int age=15;
		if(age<18){
			throw new ArithmeticException("Gaadi chlani kik umar nhi hai abhi");
		}
		System.out.println("Eligible to drive ");
	}
}
