import java.util.Scanner;
import java.io.*;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);
        String fileContent = "";
        while (input.hasNext()) {
            fileContent += input.next() + " ";
        }
        input.close();

        char[] charArr = fileContent.toCharArray();

        int counter = 0;
        for(char c : charArr)
        {
              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                   counter++;
        }
   

        System.out.println("Number of Vowels: " + counter);
      }
}

