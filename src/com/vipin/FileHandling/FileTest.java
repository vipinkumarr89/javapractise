import java.io.*;
public class FileTest{
  public static void main(String [] args) throws IOException{
  String file1 = args[0];
  File file = new File(file1);
  file.createNewFile();
  System.out.println("File Created in location "+file.getPath());

  FileOutputStream fileo = new FileOutputStream(file1);
  String str="this is vipin testing from command line";
  char array[] = str.toCharArray();
  for(int i=0;i < str.length();i++){
   fileo.write(array[i]);
   }
  }
} 
