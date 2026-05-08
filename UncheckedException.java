public class UncheckedException{
	public static void main(String[] arge){
		try{
			int a=10;		
			int b=0;
			int result=a/b;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Not possible");
		}
	}
}
