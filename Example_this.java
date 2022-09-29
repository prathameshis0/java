// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Example_this
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
A obj=new A();
}
}
class A
{
A()
{
this(10);
System.out.println("This is default Constructor");

}
A(int x)
{
this(10,20);
System.out.println("This is Parametric Constructor-  "+x);

}
A(int a,int b)
{
System.out.println("This is Constructor with 2 Parameter "+a+" "+b);
}

}