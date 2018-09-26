import java.io.*;
public class FF{
  public static void main(String [] args) throws IOException{
  String Directory1 = args[0];
  File file = new File(Directory1);
  File files[] = file.listFiles();
  	for(File f: files){
  		System.out.println("Files in location "+f.getPath()+" are "+f.getName());
   }
  }
} 
