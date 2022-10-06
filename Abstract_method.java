// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
/*
Program for Abstract Class with Hirechial inhertance
*/
class Abstract_method
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
B obj=new B();// Class B object
obj.show();
C obj1=new C();// Class C object
obj1.show();
D obj2=new D();// Class C object
obj2.show();
}
}
abstract class A // Abstract Class 
{
public abstract void show();

}
class B extends A
{
public void show()// Abstract Method
{
System.out.println("This Is class B Method From Abstract Class"); 
}
}
class C extends A
{
public void show()// Abstract method
{
System.out.println("This is Class C Method from Abstract Class");
}
}
class D extends A
{
public void show()// Abstract method
{
System.out.println("This is Class D Method from Abstract Class");
}
}