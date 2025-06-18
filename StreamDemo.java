import java.util.*;
import java.util.stream.*;

public class StreamDemo{
public static void main(String arg[]){
List<Integer> n=Arrays.asList(2,4,6,8,10,16,18);
List<Integer>result=n.stream().filter(x->x>4).map(x->x*2).sorted().distinct().collect(Collectors.toList());
System.out.println(result);

}



}