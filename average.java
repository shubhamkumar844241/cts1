class average
{
 public static void main(String args[])

{

check av=new check();
int result=av.avg(2,5,9);
System.out.println("the result average is " + result);
}
}

 class check{

int avg(int x,int y,int z)
{

int sum=0;
sum=x+y+z;
int avr=(sum)/3;
return avr;
}
}
