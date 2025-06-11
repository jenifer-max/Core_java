public class Number{
int i;
public Number(int i){
this.i=i;
}
public boolean equals(Object o){
if(this==o){
return true;
}
if (o == null || getClass() != o.getClass()){
 return false;
}
Number n= (Number)o;
return this.i==n.i;
}

public static void main(String arg[]){
Number n1= new Number(128);
Number n2= new Number(128);
System.out.println(n1.equals(n2));
}


}