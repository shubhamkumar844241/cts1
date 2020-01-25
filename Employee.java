class Employee {

int empId;
String empName;

 Employee()
{
System.out.println(" inside constructor");
}


Employee (int empId, String empName)
{
this.empId=empId;
this.empName=empName;

}

public static void main(String args[])
{
Employee emp1 = new Employee();


Employee emp2 = new Employee(101,"shubham");



System.out.println(" inside 2nd constructor" + emp2.empId  );

}
}

