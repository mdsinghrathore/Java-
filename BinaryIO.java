import java.io.*;

public class BinaryIO {
    public static void main(String[] args) throws Exception{
    FileOutputStream fos = new FileOutputStream("data.bin");
    fos.write(65);
    fos.write(66);
    fos.close();
    FileInputStream fis = new FileInputStream("data.bin");
    int data;
    while((data =fis.read()) != -1){
        System.out.println((char)data);
    }
    fis.close();
    }
}