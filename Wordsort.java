import java.util.*;
import java.io.*;
import java.lang.*;

public class Wordsort{
   public class words{

   String wrd = new String();
     int n;

 Wordsort(String wrd)
 {
   this.wrd=wrd;
   t++;
 }
      
void Wordapp(string wrd)
   {
   
    n++;
   }

void print()
{
    System.out.println(wrd,"("+n+")");
}

    }

   public static void main(String args[]) 
    {
        try{  
        File file=new File("Word.txt");
        FileInputStream f= new FileInputStream(file);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line= new String();
        
           line=br.readLine(); 
          System.out.println(line);

              String[] words=line.split(" ");
           words=line.split(".");
            words=line.split(",");
             words=line.split(";");
 System.out.println(words); 
 int i=0;
    for(int j=0;j<line.length();j++)
    {
      while(line[i]!=null)
       {
          words w;          
          if(line[j].equals(line[i])
          {
             w.Wordapp(line[i]);
          }
          
         else
         {
            w.Wordsort(line[i]);
         }
           i++;
       }

        }

    words q;
    q.print();
    
}

   }
 catch(IOException e){
    
    e.printStackTrace();
}
}
}
