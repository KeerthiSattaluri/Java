import java.util.*;
import java.lang.*;
class StudentDetails
{
  int rollno;
  String name;
  int present_days;
 public
 StudentDetails(int sid,String sname,int p)
 {
   sid=rollno;
   sname=name;
   present_days=p;
 }
 int display()
 {
   System.out.print(rollno);
   System.out.print(name);
   System.out.print(present_days);
 }

}   
public class Attendance {
    public static void main(String[] args){
      BufferedInputStream br=new BufferedInputStream(new Filereader ("SampleInput.txt"));
      String line=null;
      ArrayList<Student>s=new ArrayList<Student>();
      while((line=br.readLine())!=null)
      {
        String[] words=line.split(",");
        Student[] a=new Student();
        int count=0;
        a.rollno=words[0];
        a.name=words[1];
      for(int i=2;i<11;i++) 
       {
       if(a.present_days='P')
           a.present_days++;
       }
       }
      for(i=0;i<;i++)
       {
        a.display();
       }

  }
}
