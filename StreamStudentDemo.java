import java.util.*;
import java.util.stream.*;
class Student{
String name;
int mark;
Student(String name, int mark){
this.name=name;
this.mark=mark;

}
public String getName(){
return name;

}
public int getMark(){
return mark;

}
}
public class StreamStudentDemo{
public static void main(String arg[]){

List<Student> students=Arrays.asList(
new Student("James", 55),
new Student("Malu", 65),
new Student("Meena", 80),
new Student("Dona", 30),
new Student("Rahul", 40));

List<String> passed_students=students.stream().filter(s->s.getMark()>50).map(s->s.getName().toUpperCase()).collect(Collectors.toList());
System.out.println("Name of passed students "+passed_students);
int total_marks=students.stream().filter(s->s.getMark()>50).map(s->s.getMark()).reduce(0,(a,b)->a+b);

System.out.println("Total marks "+total_marks);
}



}
