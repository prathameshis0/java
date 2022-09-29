// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;

class Exampleclass
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Student s1=new Student();
s1.input();
s1.output();


}
}
class Student
{
Scanner sc=new Scanner(System.in);
int sid,marks;
String sname;
public void input()
{
System.out.println("Enter Student Id: ");
sid=sc.nextInt();
System.out.println("Enter Student Name: ");
sname=sc.next();
System.out.println("Enter Student Percentage : ");
marks=sc.nextInt();
}
public void output()
{
System.out.println("Student Details: ");
System.out.println("Student Id- "+sid);
System.out.println("Student Name- "+sname);
System.out.println("Student Percentage- "+marks+"%");
}

}