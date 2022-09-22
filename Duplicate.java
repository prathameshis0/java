// Id=AF0221393 Name= Prathamesh Shivgan
import java.util.Scanner;
class Duplicate
{

void check(int[] a)
{
System.out.println(" \n The Duplicate number are: ");
for(int i=0;i<a.length;i++)
{

for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
System.out.print(" "+a[i]);

}
}

} 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] a={1,2,2,3,3,4};// array
for(int i:a)
{
System.out.print(" "+i);
}
Duplicate d=new Duplicate();
d.check(a);// function
 



}
}