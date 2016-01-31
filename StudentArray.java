import java.io.*;
class Student {

        String name;

}

public class StudentArray {

    public static void main(String[] args) throws IOException{

            Student[] studentArray = new Student[10];
           studentArray[0]=new Student();//As for studentarray[0] no memory is allocated so this step is included.

              studentArray[0].name = "Tom";

            System.out.println(studentArray[0].name);

    }

}
//Error while running the program
// Exception in thread main java.lang.nullpointerException at Studentarray.main(StudentArray)
