// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Reverse
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");//eg: 123
int num=sc.nextInt();
int rev=0,dig;
while(num>0)
{
dig=num%10;//  123%10=3,dig=3,dig=2,dig=1
rev=rev*10+dig;//rev=0*10+3,rev=3*10+2,rev=32*10+1
num=num/10;//  123/10=12,12/10=1
}
System.out.println("Reverse number will be "+rev);

}
}