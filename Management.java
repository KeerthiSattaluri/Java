import java.util.*;
public class Management{
   public static void main(String[] args) throws Exception{

      Scanner in=new Scanner(System.in);

//Enter the Line
      String line=in.nextLine(); 

      int len=line.length();
      int roll;
      String name;
      int i =0; 
      
//Split the words in the line (input) and declare roll number and name of the student
      while(!Character.isDefined(line.charAt(i))) { i++; } 
      int j = i -1; 
      while(Character.isWhitespace(line.charAt(j))) { j--; }
      name = line.substring(0, j +1); 
      roll=line.substring(i,len);

//Enter the marks in eachs subject
      System.out.println("EEE100: ");
      int x1=in.nextInt();
      System.out.println("MEC100: ");
      int x2=in.nextInt();
      System.out.println("CUL101: ");
      int x3=in.nextInt();
      System.out.println("ENG111: ");
      int x4=in.nextInt();
      System.out.println("ECE101: ");
      int x5=in.nextInt();
      System.out.println("MEC181: ");
      int x6=in.nextInt();
      System.out.println("CSE131: ");
      int x7=in.nextInt();	
      System.out.println("PHY100: ");
      int x8=in.nextInt();
      System.out.println("PHY181: ");
      int x9=in.nextInt();

//Total percent in department having course code for than one 
      int y1=(x8+x9)/2;
      int y2=(x2+x6)/2;

//Allocate branch according to marks
    try{
       if(x3 >= 50 && x4 >= 50)
        {
         if(x1 >= 80 && x5 >= 60)
           System.out.println("Roll No : "+ roll + "  Name : " + name + "  Allocated Branch: EEE");
         else if(x1 >= 60 && x5 >= 80)
           System.out.println("Roll No : "+ roll + "  Name : " + name +"  Allocated Branch: ECE");
	 else if(x5 >= 70 && x7 >= 80)
           System.out.println("Roll No : "+ roll + "  Name : " + name +"  Allocated Branch: CSE");
	 else if(y2 >= 80 && y1 >= 60)
           System.out.println("Roll No : " + roll + "  Name : " + name +"  Allocated Branch: MEC");
         else
           System.out.println("Roll No : "+ roll + "  Name : " + name +"  Allocated Branch: NIL");
       } 
     }  

//If it does not happen.Show exception.
    catch(Exception e) {
      System.out.println("Branch could not be allocated");
       }
 }
}
