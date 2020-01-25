//import java.util.Arrays;
import java.util.Scanner;

class Avg{
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



 
int sum=0;
int j;
float avg;

for(j=0;j<a.length;j++)
{
sum=sum+a[j];
}
System.out.println("sum is " +sum);
avg=(sum)/(a.length);

System.out.println("avg is " +avg);
}
}