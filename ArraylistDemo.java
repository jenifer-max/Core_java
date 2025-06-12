import java.util.*;
class ArraylistDemo{
public static void main(String arg[]){
ArrayList<Object> a =new ArrayList<>();
a.add(10);
a.add("apple");
a.add("A");
a.add(12);
a.add("orange");
a.add("Null");
System.out.println(a);
a.remove(2);
System.out.println(a);
a.add(3,"Banana");
a.add(100);
System.out.println(a);
 }
}