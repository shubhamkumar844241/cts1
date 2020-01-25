class Box {
public static void main (String args[])
{
Box ob1=new Box();
Box ob2=new Box();

int result1= ob1.volume1(10,20,30);
System.out.println("first volume" + result1);

int result2= ob2.volume2(5,10,15);
System.out.println("second volume is" + result2);
} 

int volume1(int x,int y,int z)
{
int vol= x*y*z;
return vol;
}
int volume2(int a,int b, int c)
{
int vol2= a*b*c;
return vol2;
}
}