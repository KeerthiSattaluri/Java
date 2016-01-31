import java.io.*;
import java.util.*;
        
class Student1 implements Serializable{
        int id;
        String name;
        int noOfDaysPresent = 0;
        public Student1(int id, String name){
                this.id = id;
                this.name = name;
        }
        public Student1(){
        }
}
public class FileObjectReader {
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new FileReader("Attendance.txt"));
                String line = null;
               ArrayList<Student1> studentList = new ArrayList<Student1>();
                while((line = br.readLine()) != null){
                        String[] data = line.split(",");
                        Student1 s = new Student1(Integer.parseInt(data[0]), data[1]);
                        for(int i = 2; i < data.length; i++){
                                if((data[i].charAt(0)) =='P'){
                                        s.noOfDaysPresent++;
                                }
                        }
                        studentList.add(s);
                }
                Iterator itr = studentList.iterator();
                FileOutputStream ostream = new FileOutputStream("t.txt");
                ObjectOutputStream p = new ObjectOutputStream(new FileOutputStream("t.txt"));
        while(itr.hasNext()) {
        //System.out.println(itr.next());
            Student1 element = (Student1) itr.next();
            System.out.println(element.id + "\t" + element.name + "\t" + 
                                 element.noOfDaysPresent);
            //System.out.println(elementid.toString());
        	p.writeObject(element);
        //	String s=new String((byte)ostream.readObject())
        
        	
        }
        
    	ostream.close();
    	
        }
}