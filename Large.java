// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Large
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,num3;// Declare 3 variables.
System.out.println("Enter 3 number: ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
if((num1>num2) && (num1>num3)) // Checking largest number.
System.out.println(num1+" is Greater number");
else if((num2>num1) && (num2>num3))
System.out.println(num2+" is Greater number");
else
System.out.println(num3+" is Greater number");
}
}