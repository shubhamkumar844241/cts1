class Comb{

public static void main(String arg[])
{
int x,y,z;
System.out.println("numbers are");
System.out.println("first number" +Integer.parseInt(arg[0]));
System.out.println("second nmbr" +Integer.parseInt(arg[1]));
System.out.println("third nmbr" +Integer.parseInt(arg[2]));
x=Integer.parseInt(arg[0]);
y=Integer.parseInt(arg[1]);
z=Integer.parseInt(arg[2]);
for (x=0;x<10;x++)
{
for(y=0;y<10;y++)
{
for(z=0;z<10;z++)
{
if(x!=y && y!=z && x!=z)
{
System.out.println("combination is " +xyz + " " + xzy + " " + yxz + " " + yzx + " " + zxy + " " + zyx);
}
else {
System.out.println("combi is " +xyz + " " + xyz + " " + xyz);
}
}
}
}
}
}
