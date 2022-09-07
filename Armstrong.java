import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num,dig=0,rev=0;
System.out.print("Enter number: ");
num=sc.nextInt();
int temp=num;
while(num>0)
{
dig=num%10;
rev=rev+(dig*dig*dig);
num=num/10;
}
if(temp==rev)
System.out.print("Its Armstrong number ");
else
System.out.print("Its not Armstrong number ");


}
}
