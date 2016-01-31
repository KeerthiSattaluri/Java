/*
 Sample program to read from a file.
 sampleinput.txt contains the text
 Hello 1
 Apple 13
 
 
 */
import java.io.*;
public class FileReading {
	public static void main(String args[])throws Exception{
	 BufferedReader br = new BufferedReader(new FileReader("sampleinput.txt"));
     String line = null;
       while((line = br.readLine()) != null){
    	     System.out.println(line);
             String[] data = line.split(" ");//splitting the first line on the basis of space
             int i= Integer.parseInt(data[1]);// first iteration converts 1  into integer
             System.out.println(i);
           
       }
    }

}
