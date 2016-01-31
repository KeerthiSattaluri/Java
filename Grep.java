import java.io.*;
import java.lang.*;
import java.util.*;
public class Grep { 

    public static void main(String[] args) { 
        String re = ".*" + args[0] + ".*";
                In in = new In(args[1]);
        while (in.hasNextLine()) {
            String line = in.readLine();
            if (line.matches(re)) System.out.println(line);
        }
   }

}
