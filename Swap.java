// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
/*
Program for Method Overloading.

*/
class Swap
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b;
double c,d;
A obj=new A();
System.out.println("Enter Two Interger number ");
a=sc.nextInt();
b=sc.nextInt(); 
System.out.println("Enter Two Double number ");
c=sc.nextDouble();
d=sc.nextDouble();
obj.method(a,b);// Overloading method
obj.method(c,d);// Overloading method
}
}
class A
{
public void method(int a,int b)// Integer  method overloading
{
int x,y;
System.out.println("Before Swaping Interger a="+a+", b="+b);
x=b;
y=a;
System.out.println("After Swaping Interger a="+x+", b="+y); 
}
public void method(double a,double b)// Double  method overloading
{
double x,y;
System.out.println("Before Swaping Double a="+a+" , b="+b);
x=b;
y=a;
System.out.println("After Swaping Double a="+x+", b="+y); 
}
}