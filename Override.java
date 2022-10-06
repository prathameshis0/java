// Id=AF0221393 Name= Prathamesh Shivgan
/* Program For Override Method of Every Class

*/


import java.util.Scanner;
class Override
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Bank obj=new Bank();
Sbi obj1=new Sbi();
Axis obj2=new Axis();
Icici obj3=new Icici();
obj.interest();
obj1.interest();
obj2.interest();
obj3.interest();
}
}
class Bank
{
public void interest()
{
System.out.println("The Interest of Bank is 0 %");
}
}
class Sbi
{
public void interest()
{
System.out.println("The Interest of SBI is 7 %");
}
}
class Axis
{
public void interest()
{
System.out.println("The Interest of Axis is 8 %");
}
}
class Icici
{
public void interest()
{
System.out.println("The Interest of ICICI is 9 %");
}
}