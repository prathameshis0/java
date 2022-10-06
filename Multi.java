// Id=AF0221393 Name= Prathamesh Shivgan
/*
Write program to implement multiply inheritance

*/


import java.util.Scanner;
class Multi
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Person obj=new Person();
obj.getdetail();
}
}
interface Student
{
void getmarks();
void putmarks();
}
interface Emp
{
void getsalary();
void putsalary();
}
class Person implements Student,Emp
{
String pname,ch;
int sub1,sub2,sal,id;
public void getdetail()
{
System.out.println("Enter your name :");
pname=sc.next();
System.out.println("Enter your Id :");
id=sc.nextInt();
System.out.println("Enter your {S} for Student or {E} for Employee :");
ch=sc.next();
if(ch.equals("S"))
{
getmarks();
putmarks();
}
else if(ch.equals("E"))
{
getsalary();
putsalary();
}
}

Scanner sc=new Scanner(System.in);
public void getmarks()
{

System.out.println("Enter 2 subject marks:  ");
sub1=sc.nextInt();
sub2=sc.nextInt(); 
}
public void putmarks()
{
System.out.println("Student Name- "+pname+"\n Student Id- "+id+"\n");
System.out.println("Marks of Subject 1- "+sub1+"\nSubject 2-  "+sub2); 
}

public void getsalary()
{
System.out.println("Enter Your Salary");
sal=sc.nextInt();
}
public void putsalary()
{
System.out.println("Employee Name- "+pname+"\n Id- "+id+" \n");
System.out.println("Employee Salary is Rs."+sal+"-/");
}
}
