// Program for Factorial
import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,i=1,fact=1;
System.out.print("Enter number: ");
num=sc.nextInt();
int temp=num;
while(i<=num)
{
fact=fact*i;
i++;
}
System.out.print("Factorial of "+temp+" is  "+fact);

}
}