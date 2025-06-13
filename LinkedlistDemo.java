import java.util.*;
class LinkedlistDemo{
public static void main(String arg[]){
LinkedList<Object> l=new LinkedList<>();
l.add("Manu");
l.add(10);
l.add("orange");
l.add("null");
System.out.println(l);
l.set(0,"raj");
System.out.println(l);
l.removeLast();
System.out.println(l);
l.addFirst("Banana");
System.out.println(l);


}



}