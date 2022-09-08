// Id= Name=
import java.util.Scanner;
class Variables
{
int i=5;// Instaince Variables or object variables.

static int b=10;// Static variables.
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=100;//local Variabes
Variables obj=new Variables();
System.out.println("Local Variables:  "+a);
System.out.println("Object variables "+obj.i);
System.out.println("Static variablse: "+Variables.b);


}
}