// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Examplebank
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int var1,var3;
String var2;
System.out.println("Enter Account Number: ");
var1=sc.nextInt();
System.out.println("Enter Account Type: ");
var2=sc.next();
System.out.println("Enter Amount in  Account : ");
var3=sc.nextInt();
Bankcustomer b1=new Bankcustomer(var1,var2,var3);
b1.show();
Bankcustomer b2=new Bankcustomer(111122,"current");
b2.show();
}
}
class Bankcustomer
{
int acno,amt;
String actype;

Scanner sc=new Scanner(System.in);
Bankcustomer(int a,String b,int c)// Constructor with Parameter.
{
acno=a;
amt=c;
actype=b;
}
Bankcustomer(int a,String b)// Constructor with Parameter.
{
amt=1000;
acno=a;
actype=b;
}
void show()// To display input .
{
System.out.println(" \n Account Number is-  "+acno);
System.out.println("Account Type is- "+actype);
System.out.println("Account total Balance is- Rs."+amt+"/-");
}

}