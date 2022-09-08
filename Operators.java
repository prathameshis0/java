// Id=   Name=Prathamesh Shivgan
import java.util.Scanner;
class Operators
{
public static void main(String[] args)
{
int num1,num2;// Initilaztion
System.out.println("---------------Arimetics Opertion---------------------");
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number: ");
num1=sc.nextInt();// Declare value.
System.out.println("Enter Second number: ");
num2=sc.nextInt();
//Arimetics operation(+,-,*,/,%)
int result=num1+num2;// Addition 
int result1=num1-num2;// Substration
int result2=num1*num2;// Multiply
int result3=num1/num2;// Division
int result4=num1%num2;// modlus
System.out.println("Addition :"+num1+"+"+num2 +"="+result);
System.out.println("Subration: :"+num1+"-"+num2 +"="+result1);
System.out.println("Multiply :"+num1+"*"+num2 +"="+result2);
System.out.println("Division :"+num1+"/"+num2 +"="+result3);
System.out.println("Modulus :"+num1+"%"+num2 +"="+result);


// Relation opertor(==,<,>,!=)
int _num1,_num2;
System.out.println("-------------------Realtion Operation-------------");
System.out.println("Enter First number: ");
_num1=sc.nextInt();// Declare value.
System.out.println("Enter Second number: ");
_num2=sc.nextInt();
if(_num1>_num2)
System.out.println(_num1+" is Greater");
else if(_num1<_num2)
System.out.println(_num2+" is Greater");
else if(_num1==_num2)
System.out.println("Both are equal .");
else if(_num1!=_num2)
System.out.println("Both are not equal ."); 


// Unary opertor(++,--)
System.out.println("-------Unary Opertion----------");
int num_1,num_2;
System.out.println("Enter First number: ");
num_1=sc.nextInt();
System.out.println("Enter second  number: ");
num_2=sc.nextInt();
System.out.println("post Increment of first number: "+(num_1++));//post Increment
System.out.println("pre Decrement of second number:"+(--num_2));//post decrement



// Tarnary Operator
int a,b;
System.out.println("-----------Ternary Operation-------------");
System.out.println("Enter First number: ");
a=sc.nextInt();
System.out.println("Enter second  number: ");
b=sc.nextInt();
System.out.println(a>b?"First number is greater":"Second Number is greater");

//BitWise Operator(and &, or |,not ~)
System.out.println("---------BitWise Operation --------");
int x=10,y=3;
System.out.println("And operation: "+x+" &&"+y+"="+(x&y));
System.out.println("OR operation: "+x+" | "+y+"="+(x|y));
System.out.println("Not operation"+x+" is"+(~x));


}
}