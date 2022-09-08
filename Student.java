// Id=AF0221393 Name=Prathamesh Shivgan
import java.util.Scanner;
class Student
{
public static void main(String arr[])
{
int id;
String sname,attendent;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Id: ");
id=sc.nextInt();
System.out.println("Enter Student Name: ");
sname=sc.next();
System.out.println("Enter Present  or  Absent today Session:");
attendent=sc.next();

System.out.println();
System.out.println("Student details: ");
System.out.println("Student Id: "+id);
System.out.println("Student Name: "+sname);
System.out.println("Student is "+attendent+" Today Session");





}
}