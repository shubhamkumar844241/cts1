class Invoice 
{

String partnumber;
String description;
int quantity;
double price;

Invoice(String part,String des,int qn,double price)
{
partnumber=part;
description=des;
quantity=qn;
this.price=price;
}


public static void main(String args[])

{
invoice2 in = new invoice2();
in.setmet("Britania","best",500,1000);

double w= in.getmet();
System.out.println("" + w);
double y= in.getInVoice();
System.out.println("" + y);
}
}

class invoice2{

String partnumber;
String description;
int quantity;
double price;

void setmet(String prt,String ds,int q,double p)
{
partnumber=prt;
description=ds;
quantity=q;
price=p;

}

double getmet()
{
System.out.println(" name of the product is " + partnumber); 


System.out.println(" quantity of the product is " + quantity); 
return price;

}


double getInVoice()
{
double amount;

if(quantity<0)
{
quantity=0;
return quantity;
}
else if (price<0)

{
 price =0;
return price;
}

else{

amount = (quantity*price);
return amount;

}
}
}












