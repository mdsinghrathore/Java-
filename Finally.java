public class Finally{
	public static void main (String[] argfs){
		try{
			int a=10;
			int b=50;
			int result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("NHi Ho Sakta");
		}
		finally{
			System.out.println("try catch ho gya aage dekh");
		}
	}
}
