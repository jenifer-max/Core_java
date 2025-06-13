import java.util.*;
class StackDemo{
public static void main(String arg[]){
Stack<Object> s=new Stack<>();
s.push("Manu");
s.push(10);
s.push("orange");
System.out.println(s);
System.out.println(s.pop());
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.search("Manu"));
System.out.println(s.search("Z"));
System.out.println(s.empty());

}



}