package EdurekaHW.module5;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileWrite {
    public static void main(String[] args) throws Exception{
        //File creation
        FileOutputStream fout = new FileOutputStream("/tmp/Alphabets.txt");
        String alphabets = "ABCD";
        byte[] data = alphabets.getBytes();
        fout.write(data);
        System.out.println("file created");
        fout.close();
        //File Reading
        int input=0;
        FileInputStream fileInputStream = new FileInputStream("/tmp/Alphabets.txt");
        System.out.println("Reading file");
        while ((input = fileInputStream.read()) != -1){
            System.out.println((char)input);
        }
        System.out.println("file Reading Finished");
        //File copy to another file
        int foutput = 0;
        FileInputStream fin = new FileInputStream("/tmp/Alphabets.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/Alphabets2.txt");
        System.out.println("File copy started");
        while ((foutput = fin.read()) != -1){
            System.out.println("copying "+(char)foutput+" into file ");
            fileOutputStream.write((char)foutput);
        }
        System.out.println("File copied Successfully");

        //Checking copied file content
        int input1=0;
        FileInputStream fileInputStream2 = new FileInputStream("/tmp/Alphabets2.txt");
        System.out.println("Reading file 2");
        while ((input1 = fileInputStream2.read()) != -1){
            System.out.println((char)input1);
        }
        System.out.println("file 2 Reading Finished");

    }

}

