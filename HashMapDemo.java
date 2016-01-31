
import java.util.*;

class HashMapDemo{

 public static void main(String args[]){



  HashMap<String,String> hm=new HashMap<String,String>();



  hm.put("Chennai","Amit");

  hm.put("Mumbai","Vijay");

  hm.put("Delhi","Rahul");

  String name = hm.get("Chennai");

  System.out.println(name);
}
  }
