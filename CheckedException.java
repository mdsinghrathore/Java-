import java.io.File;
import java.io.FileReader;

public class CheckedException{
	public static void main(String[] args){
		try{
			File f = new File("text.txt");
			FileReader fr = new FileReader(f);
			System.out.println("file nhi khu rhi");
   		}
		catch(Exception e){
			System.out.println("file mil nhi rhi,but code chal gya ");
		}
	}
}

