// Id=AF0221393 Name= Prathamesh Shivgan
package anudip;
public class Bankcustomer
{
public int acno,amt;
public String actype;
public void getdetail(int a,String b,int c)
{
acno=a;
amt=c;
actype=b;
}
public void show()// To display input .
{
System.out.println("Account Number is-  "+acno);
System.out.println("Account Type is- "+actype);
System.out.println("Account total Balance is- Rs."+amt+"/-");
}

}
