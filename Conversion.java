public class Conversion{
static String s= "123";
public static void main(String arg[]){
int n1=Integer.parseInt(s);
Integer n2=Integer.valueOf(n1);
String str1=Integer.toString(n2);
Long n3=Long.valueOf(str1);
long n4=n3.longValue();
String str2=Long.toString(n4);
System.out.println("Original String: " + s);
        System.out.println("Parsed int: " + n1);
        System.out.println("Integer object: " + n2);
        System.out.println("Converted String: " + str1);
        System.out.println("Long object: " + n3);
        System.out.println("Primitive long: " + n4);
        System.out.println("Back to String: " + str2);
 }
 }