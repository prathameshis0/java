// Program for Arompous number 
import java.util.Scanner;
class Aromopous
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,sum=0,dig=0,num2,x=0,y=1;
System.out.println("Enter Frist number:");
num=sc.nextInt();
while(num>0)// to check sum of given digit
{
dig=num%10;
sum=sum+dig;
num=num/10;
}
System.out.println("Enter Second number:");
num2=sc.nextInt();
while(num2>0) // to check product of given digit
{
x=num2%10;
y=y*x;
num2=num2/10;
}
if(sum==y)
System.out.print("Its Aromopous number");
else
System.out.print("Its not Aromopous number");
}
}