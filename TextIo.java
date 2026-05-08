import java.io.*;
public class TextIo{
	public static void main(String[] args) throws Exception{
		PrintWriter w = new PrintWriter("daksh.txt");
		w.println("public class Main{");
		w.println("        public static void main(String[] args){");
		w.println("                System.out.println(\"Hello World\");");
		w.println("        }");
		w.println("}");
		w.close();

		BufferedReader r = new BufferedReader(new FileReader("daksh.txt"));
		String line;
		while((line = r.readLine()) != null){
			System.out.println(line);
		}
		r.close();
	}
}
	
		 
