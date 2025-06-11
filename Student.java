public class Student{
String name;
int roll_no;
Student(String name, int roll_no){
this.name=name;
this.roll_no=roll_no;
}
public boolean equals(Object o){
if(this==o){
return true;
}
if (o == null || getClass() != o.getClass()){
 return false;
}
Student s= (Student)o;
return this.name.equals(s.name)&&this.roll_no==s.roll_no;
}
public static void main(String arg[]){
Student s1=new Student("Jenifer",101);
Student s2=new Student("Jenifer",101);
System.out.println(s1);
System.out.println(s1.equals(s2));
System.out.println(s1.hashCode());
}
}