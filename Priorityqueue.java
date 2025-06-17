import java.util.*;
class Priorityqueue{
public static void main(String arg[]){

PriorityQueue<Object> q=new PriorityQueue<>();
System.out.println(q.peek());

for(int i=1;i<=10;i++){
    q.offer(i);
}
System.out.println(q);
System.out.println(q.poll());
System.out.println(q);
}
}