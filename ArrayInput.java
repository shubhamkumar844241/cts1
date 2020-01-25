import java.util.Arrays;
import java.util.Scanner;


class ArrayInput{

public static void main(String args[])
{
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("enetr length");
int length = sc.nextInt();
String input[] = new String[length];
System.out.println("enter elemnet");
for(int i=0;i<length;i++)
{
String userInput = sc.next();
input[i]=userInput;
}

System.out.println("inputs are");
System.out.println(Arrays.toString(input));

for (x=0;x<3;x++)
{
for(y=0;y<3;y++)
{
for(z=0;z<3;z++)
{
if(x!=y && y!=z && x!=z)
{
System.out.println(input[x] + " " + input[y] + " " + input[z]);
}
}
}
}
}
}
