import java.util.Scanner;


class Sri{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enetr length");
int length=sc.nextInt();
int a[]=new int[length];
System.out.println("enter elements");
for(int i=0;i<length;i++)
{
a[i]=sc.nextInt();
}
}
}