import java.lang.*;
import java.util.Scanner;

class Rev{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.println("enetr length");

int length = sc.nextInt();
int a[]=new int[length];
System.out.println("provide elements");
for(int i=0;i<length;i++)
{

 a[i]=sc.nextInt();

}

System.out.println("original array");


for(int i=0;i<a.length;i++)
{

System.out.print(a[i] + " ");
}
System.out.println();

System.out.println("reverse array is ");


for(int j=a.length-1;j>=0;j--)
{
System.out.print(a[j]);
}
}
}
