// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Examplemultiply
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Yellow y=new Yellow();
y.funred();
y.fungreen();
y.funyellow();
}
}
interface Red
{
public void funred();

}
interface  Green
{
public void fungreen();
}
class Yellow implements Red,Green
{
public void funred()
{
System.out.println("Its is function of Red invoked  from class Yellow");
}
public void fungreen()
{
System.out.println("Its is function of green invoked from class Yellow "); 
}

public void funyellow()
{
System.out.println("Its is  class function Yellow "); 
}

}