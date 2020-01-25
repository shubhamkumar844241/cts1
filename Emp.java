class Emp{
 public static void main(String args[])
{
met m= new met();
m.setId(101);
System.out.println("ID IS " + m.getId());
}

}

 class met{

int id;
public void setId( int id)
{
this.id=id;
}
public int getId()
{
return id;
}
}