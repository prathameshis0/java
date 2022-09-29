// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Example_method
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
A obj=new A()
{
void show()// body
{
System.out.println("This is Anonymous Method ");
}
};
obj.show();
A.display();

}
}

abstract class A
{
A()
{
System.out.println("This is Constructor");
}
abstract void show();//Declare of Anonymous method
static void display()// static method.
{
System.out.println("This Static Method.");
}
}