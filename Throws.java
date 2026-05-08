import java.io.*;
public class Throws {
	static void redFile() throws IOException {
		FileReader fr = new FileReader("Select.txt");
		fr.read();
	}
	public static void main(String[] args){
		try{
			redFile();
		}catch(IOException e){
			System.out.println("file ni milti online compiler pe");
		}
	}
}
