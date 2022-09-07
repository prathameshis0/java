// Program for Palidrome number 
import java.util.Scanner;
class Palidrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,rev=0,dig=0,i,temp;
System.out.println("Enter number:");
num=sc.nextInt();
temp=num;
while(num>0)
{
dig=num%10;
rev=rev*10+dig;
num=num/10;
}
if(rev==temp)
System.out.println("Its Palindrome Number");
else
System.out.println("Its not Palindrome number");
}


}